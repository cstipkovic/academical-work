package ejb.beans;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(name = "EventMDB", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue
            = "javax.jms.Queue")
    ,
 @ActivationConfigProperty(propertyName = "destination", propertyValue
            = "java:/jms/queue/eventQueue")
    ,
 @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Autoacknowledge")})
public class ProcessadorEventos implements MessageListener {

    private final static Logger LOGGER
            = Logger.getLogger(ProcessadorEventos.class.toString());

    public ProcessadorEventos() {
    }

    @Override
    public void onMessage(Message message) {
        TextMessage msg = null;
        try {
            if (message instanceof TextMessage) {
                msg = (TextMessage) message;
                System.out.println("Mensagem recebida da fila: " + msg.getText());
            } else {
                System.out.println("Mensagem de tipo não esperado: "
                        + message.getClass().getName());
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }
}
