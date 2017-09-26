package ejb.interceptors;

import javax.annotation.Resource;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

public class LogInterceptor {

    @Resource(mappedName = "java:/ConnectionFactory")
    private ConnectionFactory connectionFactory;
    @Resource(mappedName = "java:/jms/queue/eventQueue")
    private Destination destination;

    @AroundInvoke
    public Object log(InvocationContext context) throws Exception {
        Connection conn = null;
        Session session = null;
        MessageProducer producer = null;
        TextMessage message = null;
        conn = connectionFactory.createConnection(System.getProperty("username", "jmsUser"), System.getProperty("password", "jmsUser123!"));
        session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
        producer = session.createProducer(destination);
        conn.start();
        message = session.createTextMessage(context.getMethod().getName().toString());
        producer.send(message);
// Fecha conexao.
        if (conn != null) {
            conn.close();
        }
        System.out.println("---" + context.getMethod());
        return context.proceed();
    }
}
