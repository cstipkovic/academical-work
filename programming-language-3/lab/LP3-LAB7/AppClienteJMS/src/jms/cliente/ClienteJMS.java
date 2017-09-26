package jms.cliente;

import java.util.logging.Logger;
import java.util.Properties;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

public class ClienteJMS {

    private static final Logger log = Logger.getLogger(ClienteJMS.class.getName());
    private static final String CONNECTION_FACTORY = "jms/RemoteConnectionFactory";
    private static final String DESTINATION = "java:/jms/queue/eventQueue";
    private static final String MESSAGE_COUNT = "1";
    private static final String USER = "jmsUser";
    private static final String PASSWORD = "jmsUser123!";
    private static final String INITIAL_CONTEXT_FACTORY
            = "org.jboss.naming.remote.client.InitialContextFactory";
    private static final String PROVIDER_URL = "http-remoting://localhost:8080";

    public static void main(String[] args) throws Exception {
        ConnectionFactory connectionFactory = null;
        Connection conn = null;
        Session session = null;
        MessageProducer producer = null;
        MessageConsumer consumer = null;
        Destination destination = null;
        TextMessage message = null;
        Context context = null;
        try {
            // configura JNDI
            final Properties env = new Properties();
            env.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
            env.put(Context.PROVIDER_URL, System.getProperty(Context.PROVIDER_URL,
                    PROVIDER_URL));
            env.put(Context.SECURITY_PRINCIPAL, System.getProperty("username", USER));
            env.put(Context.SECURITY_CREDENTIALS, System.getProperty("password",
                    PASSWORD));
            context = new InitialContext(env);
            // lookup JNDI
            String connectionFactoryString = System.getProperty("connection.factory",
                    CONNECTION_FACTORY);
            log.info("Tentativa de obter connection factory \"" + connectionFactoryString
                    + "\"");
            connectionFactory = (ConnectionFactory) context.lookup(connectionFactoryString);
            log.info("Connection factory encontrada no JNDI \"" + connectionFactoryString
                    + "\"");
            String destinationString = System.getProperty("destination", DESTINATION);
            log.info("Tentativa de obter destination \"" + destinationString + "\"");
            destination = (Destination) context.lookup(destinationString);
            log.info("Destination \"" + destinationString + "\" econtrado no JNDI");
            // JMS - cria conexao, sessao e produtor/consumidor
            conn = connectionFactory.createConnection(System.getProperty("username", USER),
                    System.getProperty("password", PASSWORD));
            session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
            producer = session.createProducer(destination);
            // consumer = session.createConsumer(destination);
            conn.start();
            int count = Integer.parseInt(System.getProperty("message.count",
                    MESSAGE_COUNT));
            String content = System.getProperty("message.content", "Evento tipo1");
            log.info("Enviando " + count + " mensagens: " + content);
            // Envia mensagem
            for (int i = 0; i < count; i++) {
                message = session.createTextMessage(content);
                producer.send(message);
            }
        } catch (Exception e) {
            log.severe(e.getMessage());
            throw e;
        } finally {
            if (context != null) {
                context.close();
            }
            // Fecha conexao.
            if (conn != null) {
                conn.close();
            }
        }
    }
}
