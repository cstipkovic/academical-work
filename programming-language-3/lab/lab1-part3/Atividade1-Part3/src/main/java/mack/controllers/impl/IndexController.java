package mack.controllers.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import mack.controllers.AbstractController;

public class IndexController extends AbstractController {
    
    public void execute() {
        try {
            List usuarios = new ArrayList<Usuario>();
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            usuarios = (List) dao.buscaTodosUsuarios();
            this.setReturnPage("/index.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch (Exception e) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
