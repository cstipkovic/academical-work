package cinema.servlets;

import cinema.dominio.Filme;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdicionaFilmeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Cookie[] cookies = request.getCookies();
        String corFundo = "WHITE";
        
        for (Cookie c : cookies) {
            if (c.getName().equals("cor_fundo_cookie")) {
                corFundo = c.getValue();
            }
        }
        
        String titulo = request.getParameter("titulo_param");
        String ano = request.getParameter("ano_param");
        Filme novoFilme =  new Filme(titulo, Integer.parseInt(ano));
        HttpSession sessao = request.getSession();
        List<Filme> filmes = (List<Filme>) sessao.getAttribute("filmes_sessao");
        
        if (filmes == null) {
            filmes = new ArrayList<Filme>();
        }
        
        filmes.add(novoFilme);
        sessao.setAttribute("filmes_sessao", filmes);
        response.setContentType("text/html; charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdicionaFilmeServlet</title>");            
            out.println("</head>");
            out.println("<body bgColor=" +  corFundo + ">");
            out.println("<h1>Filme " + titulo + " adicionar!</h1>");
            out.println("<p><a href=\"index.html\">Retornar à página inicial</a></p>");
            out.println("<p><a href=\"FormularioCadastroFilmeServlet\">Cadastrar outro filme</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
