/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.controllers.impl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mack.controllers.AbstractController;
import mack.dao.usuario.UsuarioDAO;
import mack.dao.usuario.UsuarioDAOFactory;
import mack.entities.Usuario;

/**
 *
 * @author 31443087
 */
public class RemoverUsuarioPorId extends AbstractController {

    @Override
    public void execute() {
        Usuario user =null;
        try {
            String strId = this.getRequest().getParameter("id");
            final int id = Integer.parseInt(strId);
            UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
            dao.removeUsuario(id);
            this.setReturnPage("/usuario.jsp");
            this.getRequest().setAttribute("usuario", user);
        } catch (Exception ex) {
            Logger.getLogger(BuscaTodosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
