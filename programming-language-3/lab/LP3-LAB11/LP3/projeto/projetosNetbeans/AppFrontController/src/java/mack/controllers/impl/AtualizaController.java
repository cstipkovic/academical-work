package mack.controllers.impl;

import ejb.beans.UsuarioBeanRemote;
import ejb.entities.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import mack.controllers.AbstractController;

public class AtualizaController extends AbstractController {

    public void execute() {
        try {
            Logger.getLogger(AtualizaController.class.getName()).log(Level.INFO, null, "Atualiza");
            Context ctx = new InitialContext();
            UsuarioBeanRemote ub;
            ub = (UsuarioBeanRemote) ctx.lookup("java:global/AppEnterprise/ModuloEJB/UsuarioBean!ejb.beans.UsuarioBeanRemote");
            Usuario usuario;
            String id = this.getRequest().getParameter("id");
            String nome = this.getRequest().getParameter("nome");
            String sobrenome = this.getRequest().getParameter("sobrenome");
            String login = this.getRequest().getParameter("login");
            usuario = new Usuario();
            usuario.setId(Integer.parseInt(id));
            usuario.setNome(nome);
            usuario.setSobrenome(sobrenome);
            usuario.setLogin(login);
            usuario = ub.buscaUsuarioPorId((int) Integer.parseInt(id));
            this.setReturnPage("/mostraUsuario.jsp");
            this.getRequest().setAttribute("usuario", usuario);
        } catch (Exception ex) {
            Logger.getLogger(AtualizaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
