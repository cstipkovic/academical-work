package mack.controllers.impl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;
public class BuscaPorIdController extends AbstractController {
    @Override
    public void execute() {
        Usuario user =null;
        try {
            String strId = this.getRequest().getParameter("id");
            int id = Integer.parseInt(strId);
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            user = (Usuario)dao.buscaUsuarioPorId(id);
            this.setReturnPage("/usuario.jsp");
            this.getRequest().setAttribute("usuario", user);
        } catch (Exception ex) {
            Logger.getLogger(BuscaTodosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}