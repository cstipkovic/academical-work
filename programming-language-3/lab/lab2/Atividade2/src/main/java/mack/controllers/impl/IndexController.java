package mack.controllers.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.entities.Usuario;

public class IndexController extends AbstractController {
    
    public void execute() {
        
        try {
            List usuarios = new ArrayList<Usuario>();
            UsuarioDAO dao = UsuarioDaoFactory.getUsuarioDAO();
            usuarios = (List) dao.buscaTodosUsuarios();
            this.setReturnPage("/index.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch (Exception e) {
//            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
