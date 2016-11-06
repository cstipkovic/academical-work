package mack.servlets;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {

    private static final long serialVersionID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("JSESSIONSID")) {
                    System.out.println("JSESSIONID=" + cookie.getValue());
                    break;
                }
            }
        }

        // Invalidate the session if exits
        HttpSession session = request.getSession(false);
        System.out.println("Usuario=" + session.getAttribute("usuario"));

        if (session != null) {
            session.invalidate();
        }

        response.sendRedirect("login.html");
    }
}
