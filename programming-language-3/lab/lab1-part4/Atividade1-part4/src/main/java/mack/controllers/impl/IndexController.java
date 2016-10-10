package mack.controllers.impl;

import mack.controllers.AbstractController;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IndexController extends AbstractController {

    public void execute() {
        try {
            List usuarios = new ArrayList<Usuario>();
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            usuario = (List) dao.busca.TodosUsuarios();
            this.setReturnPage("/index.jsp");
            this.getRequest().setAttribute("usuarios", usuario);
        } catch (Exception e) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
