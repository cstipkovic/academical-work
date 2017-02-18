package mack.controllers.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.entities.Usuario;

public class ListaUsuariosController extends AbstractController {
    
    public void execute() {
        try {
            this.setReturnPage("/listarUsuarios.jsp");
            this.getRequest().setAttribute("usuarios", this.getUsuarios());
        } catch (Exception e) {
            Logger.getLogger(ListaUsuariosController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public List getUsuarios() {
        List usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario(1, "Mack", "Junior"));
        usuarios.add(new Usuario(2, "Mack", "Neto"));
        
        return usuarios;
    }
}
