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

public class BuscaController extends AbstractController {

    public void execute() {
        try {
            List usuarios = new ArrayList<Usuario>();
            String nome = this.getRequest().getParameter("nome");
            Context ctx = new InitialContext();
            UsuarioBeanRemote ub;
            ub = (UsuarioBeanRemote) ctx.lookup("java:global/AppEnterprise/ModuloEJB/UsuarioBean!ejb.beans.UsuarioBeanRemote");
            Usuario usuario;
            usuarios = (List) ub.buscaUsuarioPorNome(nome);
            this.setReturnPage("/listaUsuarios.jsp");
            this.getRequest().setAttribute("usuarios", usuarios);
        } catch (Exception ex) {
            Logger.getLogger(BuscaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
