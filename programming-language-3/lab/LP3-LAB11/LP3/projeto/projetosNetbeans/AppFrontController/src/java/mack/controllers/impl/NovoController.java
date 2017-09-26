package mack.controllers.impl;

import ejb.beans.UsuarioBeanRemote;
import ejb.entities.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import mack.controllers.AbstractController;

public class NovoController extends AbstractController {

    public void execute() {
        try {
            Logger.getLogger(NovoController.class.getName()).log(Level.INFO, null, "Novo");
            Usuario usuario;
            String nome = this.getRequest().getParameter("nome");
            String sobrenome = this.getRequest().getParameter("sobrenome");
            String login = this.getRequest().getParameter("login");
            String senha = this.getRequest().getParameter("senha");
            Context ctx = new InitialContext();
            UsuarioBeanRemote ub;
            ub = (UsuarioBeanRemote) ctx.lookup("java:global/AppEnterprise/ModuloEJB/UsuarioBean!ejb.beans.UsuarioBeanRemote");
            usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setSobrenome(sobrenome);
            usuario.setLogin(login);
            usuario.setHash(ub.getHash(senha));
            usuario = ub.criaUsuario(usuario);
            this.setReturnPage("/mostraUsuario.jsp");
            this.getRequest().setAttribute("usuario", usuario);
        } catch (Exception ex) {
            Logger.getLogger(NovoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
