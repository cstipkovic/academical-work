package mack.controllers.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;

public class BuscaController extends AbstractController {

    public void execute() {
        try {
            List usuarios = new ArrayList<Usuario>();
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
//            usuarios = (List) dao.buscaUsuarioPorNome()
        } catch (Exception e) {
            Logger.getLogger(BuscaController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
