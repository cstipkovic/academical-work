package mack.servlets;

import br.mack.ejb.MeuPrimeiroBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MeuPrimeiroBeanServlet extends HttpServlet {

    private MeuPrimeiroBean meuBean;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Context context = null;
            try {
                context  = new InitialContext();
                meuBean = (MeuPrimeiroBean) context.lookup("java:app/ModuloEJB/MeuPrimeiroBean");
            } catch (NamingException ex) {
                Logger.getLogger(MeuPrimeiroBeanServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MeuPrimeiroBeanServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MeuPrimeiroBeanServlet at " + meuBean.metodoDeNegocio() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
    }

}
