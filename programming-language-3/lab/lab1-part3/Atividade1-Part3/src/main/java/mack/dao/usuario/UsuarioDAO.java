package mack.dao.usuario;

import java.util.Collection;
import mack.entities.Usuario;

public interface UsuarioDAO {
    
    public Usuario buscaUsuarioPorId(int id) throws UsuarioNaoEncontradoException;
<<<<<<< HEAD
    
    public Collection buscaUsuarioPorNome(String nome);
    
    public Collection buscaTodosUsuarios();
    
    public void removeUsuario(int id) throws UsuarioNaoEncontradoExpcetion;
    
    public Usuario criaUsuario(String nome, String sobrenome);
    
    public void updateUsuario(int id, String nome, String sobrenome) throws UsuarioNaoEncontradoException;
    
    public void close();
    
=======
    public Collection buscaUsuarioPorNome(String nome);
    public Collection buscaTodosUsuarios();
    public void removeUsuario(int id) throws UsuarioNaoEncontradoException;
    public Usuario criaUsuario(String nome, String sobrenome);
    public void updateUsuario(int id, String nome, String sobrenome) throws UsuarioNaoEncontradoException;
    public void close();
>>>>>>> 1950078326ad055a14f29356ba8c2e2e3b0ffc8f
    public boolean isClosed();
}
