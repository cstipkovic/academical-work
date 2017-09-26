
package monitor.ejbs;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import monitor.entities.Log;


@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java:/jms/queue/eventQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ProcessadorMensagens implements MessageListener {
    
  @PersistenceContext(unitName = "DerbyMonitPU")
    private EntityManager em;
    
    public ProcessadorMensagens() {
    }
    
    @Override
    public void onMessage(Message message) {
        if (message instanceof TextMessage){
            TextMessage txtmsg = (TextMessage)message;
            Log log = new Log();
            try {
                log.setEvento(txtmsg.getText());
            } catch (JMSException ex) {
                Logger.getLogger(ProcessadorMensagens.class.getName()).log(Level.SEVERE, null, ex);
            }
            log.setTimestamp(new Timestamp(Calendar.getInstance().getTimeInMillis()));
            em.persist(log);
        }
        
    }
    
}
