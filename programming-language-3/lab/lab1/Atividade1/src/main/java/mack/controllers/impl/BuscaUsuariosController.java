package mack.controllers.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;

public class BuscaUsuariosController extends AbstractController{
    
    public void execute() {
        try {
            this.setReturnPage("/buscaUsuarios.jsp");
            this.getRequest().setAttribute("usuarios", this);
        } catch (Exception e) {
            Logger.getLogger(BuscaUsuariosController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
//    public List findUsuario(String nome) {
//        
//    }
}
