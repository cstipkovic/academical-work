package mack.servlets;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServer {

    private static final long serialVersionID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        Cookie[] cookie = request.getCookies();
//        TODO: parei aqui (pagina 11)
//        http://moodle.mackenzie.br/moodle/pluginfile.php/1410439/mod_resource/content/1/LP3%20-%20Laborato%CC%81rio%2005%20-%20Pra%CC%81tica%20-%20Filter.pdf
    }
}
