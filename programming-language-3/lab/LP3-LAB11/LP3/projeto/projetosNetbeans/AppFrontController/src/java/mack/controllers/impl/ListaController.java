package mack.controllers.impl;

import ejb.beans.UsuarioBeanRemote;
import ejb.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import mack.controllers.AbstractController;

public class ListaController extends AbstractController {

    public void execute() {
        try {
            Logger.getLogger(ListaController.class.getName()).log(Level.INFO, null, "Lista");
            Context ctx = new InitialContext();
            UsuarioBeanRemote ub;
            ub = (UsuarioBeanRemote) ctx.lookup("java:global/AppEnterprise/ModuloEJB/UsuarioBean!ejb.beans.UsuarioBeanRemote");
            List usuarios = new ArrayList<Usuario>();
            usuarios = (List) ub.list();
            this.setReturnPage("/listaUsuarios.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch (Exception ex) {
            Logger.getLogger(ListaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
