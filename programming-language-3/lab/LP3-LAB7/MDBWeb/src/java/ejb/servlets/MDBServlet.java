package ejb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MDBServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ConnectionFactory connectionFactory = null;
        Connection conn = null;
        Session session = null;
        MessageProducer producer = null;
        MessageConsumer consumer = null;
        Destination destination = null;
        TextMessage message = null;
        Context context = null;
        try {
            context = new InitialContext();
            connectionFactory = (ConnectionFactory) context.lookup("java:/ConnectionFactory");
            destination = (Destination) context.lookup("java:/jms/queue/eventQueue");
            conn = connectionFactory.createConnection("jmsUser", "jmsUser123!");
            session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
            producer = session.createProducer(destination);
            conn.start();
            message = session.createTextMessage("Mensagem Tipo 2");
            producer.send(message);
            producer.close();
            session.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MDBServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MDBServlet : Evento gerado com sucesso</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
