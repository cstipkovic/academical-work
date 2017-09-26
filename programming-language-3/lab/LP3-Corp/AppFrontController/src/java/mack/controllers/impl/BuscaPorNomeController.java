package mack.controllers.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;

public class BuscaPorNomeController extends AbstractController {

    @Override
    public void execute() {
        Usuario user = null;
        try {
            String strNome = this.getRequest().getParameter("nome");
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            user = (Usuario) dao.buscaUsuarioPorNome(strNome);
            this.setReturnPage("/usuario.jsp");
            this.getRequest().setAttribute("usuario", user);
        } catch (Exception ex) {
            Logger.getLogger(BuscaTodosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
