/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.controllers.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;

/**
 *
 * @author 1145977
 */
public class NovoController extends AbstractController {

    public void execute() {
        try {
            Logger.getLogger(NovoController.class.getName()).log(Level.INFO, null, "Novo");
            Usuario usuario;
            String nome = this.getRequest().getParameter("nome");
            String sobrenome = this.getRequest().getParameter("sobrenome");
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            usuario = (Usuario) dao.criaUsuario(nome, sobrenome);
            this.setReturnPage("/mostraUsuario.jsp");
            this.getRequest().setAttribute("usuario", usuario);
        } catch (Exception ex) {
            Logger.getLogger(NovoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
