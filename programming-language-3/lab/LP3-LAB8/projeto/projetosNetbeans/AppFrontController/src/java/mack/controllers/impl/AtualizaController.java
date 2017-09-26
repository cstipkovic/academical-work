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
public class AtualizaController extends AbstractController {

    public void execute() {
        try {
            Logger.getLogger(AtualizaController.class.getName()).log(Level.INFO, null, "Atualiza");
            Usuario usuario;
            String id = this.getRequest().getParameter("id");
            String nome = this.getRequest().getParameter("nome");
            String sobrenome = this.getRequest().getParameter("sobrenome");
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            dao.updateUsuario(Integer.parseInt(id), nome, sobrenome);
            usuario = dao.buscaUsuarioPorId(Integer.parseInt(id));
            this.setReturnPage("/mostraUsuario.jsp");
            this.getRequest().setAttribute("usuario", usuario);
        } catch (Exception ex) {
            Logger.getLogger(AtualizaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
