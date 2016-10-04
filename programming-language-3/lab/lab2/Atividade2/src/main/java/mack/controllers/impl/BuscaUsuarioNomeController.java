package mack.controllers.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;

public class BuscaUsuarioNomeController extends AbstractController {

    public void execute() {
        try {
            List usuarios = new ArrayList<Usuario>();
            String param = this.getRequest().getParameter("usuario");
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            usuarios = (List) dao.buscaUsuarioPorNome(param);
            this.setReturnPage("/Lista.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch (Exception e) {
            Logger.getLogger(BuscaUsuarioNomeController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
