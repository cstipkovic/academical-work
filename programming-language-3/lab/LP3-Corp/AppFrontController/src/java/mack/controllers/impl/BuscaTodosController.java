package mack.controllers.impl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;
public class BuscaTodosController extends AbstractController {
    @Override
    public void execute() {
        try {
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            List usuarios = (List<Usuario>)dao.buscaTodosUsuarios();
            this.setReturnPage("/index.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch (Exception ex) {
            Logger.getLogger(BuscaTodosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}