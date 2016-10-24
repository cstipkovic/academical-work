package mack.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final String userID = "admin";
    private final String password = "senha";

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String usuarioRequest = request.getParameter("login");
        String senhaRequest = request.getParameter("senha");

        if (userID.equals(usuarioRequest) && password.equals(senhaRequest)) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuarioRequest);

            session.setMaxInactiveInterval(30*60);
            Cookie userName = new Cookie("usuario", usuarioRequest);
            userName.setMaxAge(30*60);
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
