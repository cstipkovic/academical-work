package mack.dao.usuario;
import mack.entities.Usuario;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.apache.commons.logging.*;
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
            throw new UsuarioNaoEncontradoException("usuario não encontrado");
        }
        em.clear();
        em.close();
        emf.close();
        return u;
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
    @Override
    public Collection buscaUsuarioPorNome(final String nome) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT nome FROM Usuario");
        Collection result = null;
        result = q.getResultList();
        return result;
    }
    @Override
    public void removeUsuario(final int id)
            throws UsuarioNaoEncontradoException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        Usuario u = em.find(Usuario.class, id);
        if (u == null) {
            throw new UsuarioNaoEncontradoException("usuario não encontrado");
        }
        Query q = em.createQuery("DELETE FROM Usuario WHERE id=u.id");
        em.clear();
        em.close();
        emf.close();    
    }
    @Override
    public Usuario criaUsuario(
            final String nome,
            final String sobrenome) {
        Usuario result = null;
        return result;
    }
    @Override
    public void updateUsuario(final int id,
            final String nome,
            final String sobrenome) throws UsuarioNaoEncontradoException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("UPDATE Usuario SET nome=nome,sobrenome=sobrenome WHERE id=id  ");
        em.clear();
        em.close();
        emf.close(); 
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
}