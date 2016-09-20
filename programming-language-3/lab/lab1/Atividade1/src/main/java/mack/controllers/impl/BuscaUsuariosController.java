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
            String usuario = this.getRequest().getParameter("usuario");
            
            this.setReturnPage("/buscaUsuarios.jsp");            
            this.getRequest().setAttribute("usuario", this.findUsuario(usuario));
        } catch (Exception e) {
            Logger.getLogger(BuscaUsuariosController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public String findUsuario(String usuario) {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario(1, "Junior", "Mack"));
        usuarios.add(new Usuario(2, "Neto", "Mack"));
        
        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
            if (u.getNome().toString().equals(usuario)) {
                return u.getNome().toString();
            }
        }
        
        return "Nao encontrado";
    }
}
