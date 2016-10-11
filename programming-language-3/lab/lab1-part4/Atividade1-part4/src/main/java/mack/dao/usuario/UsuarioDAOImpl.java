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

    public void removeUsuario(final int id) throws UsuarioNaoEncontradoException {
        Connection conn = UsuarioUtil.getConnection();
        PreparedStatement stmtDelete  = null;

        try {
            StringBuilder sbDelete = new StringBuilder();
            sbDelete.append("DELETE FROM ");
            sbDelete.append(UsuarioConstates.USUARIO_TABLE_NAME);
            sbDelete.append(" WHERE usuario_id = ?");

            stmtDelete = conn.prepareStatement(sbDelete.toString());
            stmtDelete.setInt(1, id);

            int rows = stmtDelete.executeUpdate();
            if (rows != 1) {
                throw new SQLException("executeUpdate return value: " + rows);
            }
        } catch (SQLException e) {
            log.error(e);
            throw new DAORuntimeException(e);
        } finally {
            UsuarioUtil.closeStatement(stmtDelete);
            UsuarioUtil.closeJDBCConnection(conn);
        }
        
    }

    public Usuario criaUsuario(final String nome, final String sobrenome) {
        Usuario result = null;
        PreparedStatement stmtInsert = null;
        Connection conn = UsuarioUtil.getConnection();

        try {
            int usuario_id = UsuarioUtil.getUniqueUsuario(conn);

            StringBuilder sbInsert = new StringBuilder();
            sbInsert.append("INSERT INTO ");
            sbInsert.append(UsuarioConstantes.USUARIO_TABLE_NAME);
            sbInsert.append(" (usuario_id, nome, sobrenome) ");
            sbInsert.append(" VALUES (");
            sbInsert.append("NEXT VALUE FOR ");
            sbInsert.append(UsuarioConstantes.USUARIO_ID_SEQUENCE_NAME);
            sbInsert.append(", ?, ?)");

            stmtInsert = conn.prepareStatement(sbInsert.toString());
            stmtInsert.setString(1, nome);
            stmtInsert.setString(2, sobrenome);

            log.info("About to execute INSERT: values " +
                nome + ", " +
                sobrenome);

            int rows = stmtInsert.executeUpdate();
            if (rows != 1) {
                throw new SQLException("executeUpdate return value: " + rows);
            }
;        } catch (SQLException e) {
            log.error(e);
            throw new DAoRuntimeException(e);
        } finally {
            UsuarioUtil.closeStatemente(stmtInsert);
            UsuarioUtil.closeJDBCConnection(conn);
        }

        return result;
    }

    public void updateUsuario(final int id, final String nome, final String sobrenome)
        throws UsuarioNaoEncontradoException {
        Connection conn = UsuarioUtil.getConnection();
        PreparedStatement stmtUpdate = null;

        try {
            StringBuilder sbUpdate = new StringBuilder();

            sbUpdate.append("UPDATE ");
            sbUpdate.append(UsuarioConstantes.USUARIO_TABLE_NAME);
            sbUpdate.append(" SET ");

        }
    }
}
