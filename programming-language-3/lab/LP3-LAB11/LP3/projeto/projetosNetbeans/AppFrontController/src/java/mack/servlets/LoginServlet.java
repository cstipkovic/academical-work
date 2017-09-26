package mack.servlets;

import ejb.beans.UsuarioBeanRemote;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
// get request parameters for userID and password
        String usuarioRequest = request.getParameter("login");
        String senhaRequest = request.getParameter("senha");
        
          Context ctx = null;
          UsuarioBeanRemote ub =null;
        try {
            ctx = new InitialContext();
            ub = (UsuarioBeanRemote) ctx.lookup("java:global/AppEnterprise/ModuloEJB/UsuarioBean!ejb.beans.UsuarioBeanRemote");
        } catch (NamingException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        if (ub.autentica(usuarioRequest, senhaRequest)) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuarioRequest);
//setting session to expiry in 30 mins
            session.setMaxInactiveInterval(30 * 60);
            Cookie userName = new Cookie("usuario", usuarioRequest);
            userName.setMaxAge(30 * 60);
            response.addCookie(userName);
            response.sendRedirect("sucessoLogin.jsp");
        } else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Usuario ou senha incorretos.</font>");
            rd.include(request, response);
        }
    }
}
