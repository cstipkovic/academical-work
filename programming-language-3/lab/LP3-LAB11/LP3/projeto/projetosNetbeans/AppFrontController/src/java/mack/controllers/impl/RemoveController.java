package mack.controllers.impl;

import ejb.beans.UsuarioBeanRemote;
import ejb.entities.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import mack.controllers.AbstractController;

public class RemoveController extends AbstractController {

    public void execute() {
        try {
            Logger.getLogger(RemoveController.class.getName()).log(Level.INFO, null, "Lista");
            String id = this.getRequest().getParameter("id");
            List<Usuario> usuarios;
            //usuarios = new ArrayList<Usuario>();
            Context ctx = new InitialContext();
            UsuarioBeanRemote ub;
            ub = (UsuarioBeanRemote) ctx.lookup("java:global/AppEnterprise/ModuloEJB/UsuarioBean!ejb.beans.UsuarioBeanRemote");
            ub.removeUsuario(Integer.parseInt(id));
            usuarios = (List) ub.list();
            this.setReturnPage("/listaUsuarios.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch (Exception ex) {
            Logger.getLogger(RemoveController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
