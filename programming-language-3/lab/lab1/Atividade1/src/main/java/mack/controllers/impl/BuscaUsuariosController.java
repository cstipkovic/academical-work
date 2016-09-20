package mack.controllers.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.entities.Usuario;

public class BuscaUsuariosController extends AbstractController{
    
    public void execute() {
        try {
            this.setReturnPage("/buscaUsuarios.jsp");
            this.getRequest().setAttribute("usuarios", this.findUsuario());
        } catch (Exception e) {
            Logger.getLogger(BuscaUsuariosController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public List findUsuario() {
        List usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario(1, "Mack", "Junior"));
        usuarios.add(new Usuario(2, "Mack", "Neto"));
        
        return usuarios;
    }
}
