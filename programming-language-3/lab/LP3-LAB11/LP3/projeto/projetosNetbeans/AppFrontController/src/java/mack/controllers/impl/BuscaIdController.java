package mack.controllers.impl;

import ejb.beans.UsuarioBeanRemote;
import ejb.entities.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import mack.controllers.AbstractController;

public class BuscaIdController extends AbstractController {

    public void execute() {
        try {
            Logger.getLogger(BuscaIdController.class.getName()).log(Level.INFO, null, "BuscaId");
            String id = this.getRequest().getParameter("id");
            Context ctx = new InitialContext();
            UsuarioBeanRemote ub;
            ub = (UsuarioBeanRemote) ctx.lookup("java:global/AppEnterprise/ModuloEJB/UsuarioBean!ejb.beans.UsuarioBeanRemote");
            Usuario usuario;
            usuario = (Usuario) ub.buscaUsuarioPorId(Integer.parseInt(id));
            this.setReturnPage("/mostraUsuario.jsp");
            this.getRequest().setAttribute("usuario", usuario);
        } catch (Exception ex) {
            Logger.getLogger(BuscaIdController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
