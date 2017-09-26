package monitor.ejbs;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import monitor.entities.Log;

@Stateless
@LocalBean
public class Sumarizador {

    @PersistenceContext(unitName = "DerbyMonitPU")
    private EntityManager em;

    @Schedule(second = "*/10", minute = "*", hour = "*", persistent = false)
    public void sumariza() {
        HashMap<String, Integer> sumario;
        sumario = new HashMap<String, Integer>();
        Query query = em.createQuery("FROM Log l");
        List<Log> list = query.getResultList();
        if (list != null) {
            for (Log l : list) {
                Integer i = sumario.get(l.getEvento());
                if (i != null) {
                    i = i + 1;
                    sumario.put(l.getEvento(), i);
                } else {
                    sumario.put(l.getEvento(), 0);
                }
            }
        }
        publicaDados(sumario);
    }

    private void publicaDados(HashMap<String, Integer> hash) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("C:/Temp/LP3/projeto/dados/monitoramento.xml", "UTF-8");
            writer.println("<cenario>");
            writer.println("<retangulos>");
            Iterator it = hash.entrySet().iterator();
            int posx = 20;
            while (it.hasNext()) {
                writer.println("<retangulo>");
                writer.println("<posx>" + posx + "</posx>");
                writer.println("<posy>20</posy>");
                writer.println("<largura>50</largura>");
                Map.Entry pair = (Map.Entry) it.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());
                writer.println("<altura>" + pair.getValue() + "</altura>");
                writer.println("<item>" + pair.getKey() + "</item>");
                writer.println("</retangulo>");
                posx = posx + 70;
            }
            writer.println("</retangulos>");
            writer.println("</cenario>");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sumarizador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Sumarizador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
