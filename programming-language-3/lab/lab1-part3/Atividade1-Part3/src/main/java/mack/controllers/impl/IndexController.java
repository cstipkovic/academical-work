package mack.controllers.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
<<<<<<< HEAD
import mack.controllers.AbstractController;
=======
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.entities.Usuario;
>>>>>>> 1950078326ad055a14f29356ba8c2e2e3b0ffc8f

public class IndexController extends AbstractController {
    
    public void execute() {
        try {
            List usuarios = new ArrayList<Usuario>();
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            usuarios = (List) dao.buscaTodosUsuarios();
<<<<<<< HEAD
            this.setReturnPage("/index.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch (Exception e) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
=======
            this.setReturnPage("index.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
            
        } catch (Exception e) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, e);
        }
    }    
>>>>>>> 1950078326ad055a14f29356ba8c2e2e3b0ffc8f
}
