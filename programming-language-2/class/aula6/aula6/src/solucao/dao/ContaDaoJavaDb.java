package solucao.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cstipkovic
 */
public class ContaDaoJavaDb implements ContaDaoInterface {
    
    @Override
    public List<Conta> listarTudo() {
        List<Conta> contas = new ArrayList<>();
        
        try {
            Class.forName("org.apache.derby.idbc.ClientDriver");
            
            String url = "jdbc:derby://127.0.0.1:1527/banco";
            
        } catch (Exception e) {
        }
    }
 }
