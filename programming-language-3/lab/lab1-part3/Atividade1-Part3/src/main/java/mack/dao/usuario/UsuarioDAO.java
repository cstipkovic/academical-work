package mack.dao.usuario;

import java.util.Collection;
import mack.entities.Usuario;

public interface UsuarioDAO {
    
    public Usuario buscaUsuarioPorId(int id) throws UsuarioNaoEncontradoException;
    
    public Collection buscaUsuarioPorNome(String nome);
    
    public Collection buscaTodosUsuarios();
    
    public void removeUsuario(int id) throws UsuarioNaoEncontradoExpcetion;
    
    public Usuario criaUsuario(String nome, String sobrenome);
    
    public void updateUsuario(int id, String nome, String sobrenome) throws UsuarioNaoEncontradoException;
    
    public void close();
    
    public boolean isClosed();
}
