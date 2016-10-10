package mack.dao.usuario;

import mack.entities.Usuario;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

public class UsuarioDAOImpl implements UsuarioDAO {

    static final private Log log = LogFactory.getLog(UsuarioDAOImpl.class);

    private boolean bIsClosed = false;

    public UsuarioDAOImpl() {
        bIsClosed = false;
    }

    public Usuario buscaUsuarioPorId(final int id) throws UsuarioNaoEncontradoExpcetion {
        Connection conn = UsuarioUtil.getConnection();
        Usuario result = null;
        ResultSet rs = null;
        PreparedStatement stmtSelect = null;

        try {
            StringBuilder sbSelect = new StringBuilder();
            sbSelect.append("SELECT usuario_id, nome, sobrenome FROM ");
            sbSelect.append(UsuarioConstantes.USUARIO_TABLE_NAME);
            sbSelect.append(" WHERE usuario_id = ?");

            stmtSelect = conn.prepareStatement(sbSelect.toString());
            stmtSelect.setInt(1, id);
            rs = stmtSelect.executeQuery();

            Collection c = UsuarioUtil.makeUsuarioObjectsFromResultSet(rs);
            if (c.size() != 1) {
                throw new UsuarioNaoEncontradoException("id = " + id);
            }

            Iterator iter = c.iterator();
            result = (Usuario) iter.next();
        } catch (SQLException e) {
            log.error(e);
            throw new DAORuntimeExpection(e);
        } finally {
            UsuarioUtil.closeStatement(stmtSelect);
            UsuarioUtil.closeResultSet(rs);
            UsuarioUtil.closeJDBCConnection(conn);
        }

        return result;
    }

    public Collection buscaUsuarioPorNome(final String nome) {
        Connection conn = UsuarioUtil.getConnection();
        Collection result = null;
        ResultSet rs = null;
        PreparedStatement stmtSelect = null;

        try {
            StringBuilder sbSelect = new StringBuilder();
            sbSelect.append("SELECT usuario_id, nome, sobrenome FROM ");
            sbSelect.append(UsuarioConstantes.USUARIO_TABLE_NAME);
            sbSelect.append(" WHERE nome = ?");

            stmtSelect = conn.prepareStatement(sbSelect.toString());
            rs = stmtSelect.executeQuery();
            result = UsuarioUtil.makeUsuarioObjectsFromResultSet(rs);
        } catch (SQLException e) {
            log.error(e);
            throw new DAORuntimeException(e);
        } finally {
            UsuarioUtil.closeStatement(stmtSelect);
            UsuarioUtil.closeResultSet(rs);
            UsuarioUtil.closeJDBCConnection(conn);
        }

        return result;
    }

    // TODO: Parei aqui
    public void removeUsuario(final int id) {
        
    }
}
