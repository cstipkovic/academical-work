package ejb.services;

import ejb.beans.UsuarioBean;
import ejb.entities.Usuario;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService
public class UsuarioService {

    @EJB
    UsuarioBean ub;

    @WebMethod(operationName = "findById")
    public Usuario buscaUsuarioPorId(@WebParam(name = "id") final int id) {
        Usuario u = ub.buscaUsuarioPorId(id);
        return u;
    }

    @WebMethod(operationName = "insertUser")
    public void insereUsuario(@WebParam(name = "user") final Usuario u) {
        ub.criaUsuario(u);
    }
}
