package mack.dao.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.text.html.parser.DTDConstants;
import mack.dao.exception.DAORuntimeException;
import mack.entities.Usuario;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UsuarioDAOJPAImpl implements UsuarioDAO {
    
    static final private Log log = LogFactory.getLog(UsuarioDAOJPAImpl.class);
    private boolean bIsClosed = false;

    public UsuarioDAOJPAImpl() {
    }
    
    @Override
    public Usuario buscaUsuarioPorId(final int id) 
        throws UsuarioNaoEncontradoException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        
        Usuario u = em.find(Usuario.class, id);
        if (u == null) {
            throw new UsuarioNaoEncontradoException("usuario nao encontrado");
        }
        
        em.clear();
        em.close();
        emf.close();
        
        return u;
    }
    
    @Override
    public Collection buscaUsuarioPorNome(final String nome) {
        Collection result = null;
        
        return result;
    }
    
    @Override
    public void removeUsuario(final int id)
        throws UsuarioNaoEncontradoException {
        
    }
    
    @Override
    public Usuario criaUsuario(final String nome, final String sobrenome) {
        Usuario result = null;
        
        return result;
    }
    
    @Override
    public void updateUsuario(final int id, final String nome, final String sobrenome)
            throws UsuarioNaoEncontradoException {
        
    }
    
    @Override
    public void close() {
        log.info("close() called");
        bIsClosed = true;
    }
    
    @Override
    public boolean isClosed() {
        return bIsClosed;
    }
    
    @Override
    public Collection buscaTodosUsuarios() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createQuery("select u from Usuario u");
        Collection result = null;
        result = q.getResultList();
        
        em.clear();
        em.close();
        emf.close();
        
        return result;
    }
}
