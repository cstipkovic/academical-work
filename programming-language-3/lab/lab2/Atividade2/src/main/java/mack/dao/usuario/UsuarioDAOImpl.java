package mack.dao.usuario;

import mack.entities.Usuario;
import mack.entities.UsuarioImpl;
import java.sql.*;
import java.util.*;
import mack.dao.exception.DAORuntimeException;


class UsuarioDAOImpl implements UsuarioDAO {
    
    static final private Log log = LogFactory.getLog(UsuarioDAOImpl.class);
    private boolean bIsClosed = false;

    public UsuarioDAOImpl() {
        bIsClosed = false;
    }

    @Override
    public Usuario buscaUsuarioPorId(final int id) 
            throws UsuarioNaoEncontradoException {
        Connection conn = UsuarioUtil.getConnection();
        Usuario result = null;
        ResultSet rs = null;
        PreparedStatement stmtSelect = null;
        
        try {
            StringBuilder sbSelect = new StringBuilder();
            sbSelect.append("SELECT usuario_id, nome, sobrenome FROM");
            sbSelect.append(UsuarioConstantes.USUARIO_TABLE_NAME);
            sbSelect.append("WHERE usuario_id = ");
            stmtSelect = conn.prepareStatement(sbSelect.toString());
            stmtSelect.setInt(1, id);
            rs = stmtSelect.executeQuery();
            
            Collection c = UsuarioUtil.makeUsuarioObjectsFromResultSet(rs);
            if (c.size() != 1) {
                throw new UsuarioNaoEncontradoException("id = " + id);
            }
            Iterator iter = c.iterator();
            result = (Usuario) iter.next();
        } catch (SQLException ex) {
            log.error(ex);
            throw new DAORuntimeException(ex);
        } finally {
            UsuarioUtil.closeStatement(stmtSelect);
            UsuarioUtil.closeResultSet(rs);
            UsuarioUtil.closeJDBCConnection(conn);
        }
    }
    
    @Override
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
            stmtSelect.setString(1, nome);
            rs = stmtSelect.executeQuery();
            result = UsuarioUtil.makeUsuarioObjectFromResultSet(rs);
        } catch (SQLException ex) {
            log.error(ex);
            throw new DAORuntimeException(ex);
        } finally {
            UsuarioUtil.closeStatement(stmtSelect);
            UsuarioUtil.closeResultSet(rs);
            UsuarioUtil.closeJDBCConnection(conn);
        }
        
        return result;
    }
    
    @Override
    public void removeUsuario(final int id) 
            throws UsuarioNaoEncontradoException {
        Connection conn = UsuarioUtil.getConnection();
        PreparedStatement stmtDelete = null;
        
        try {
            StringBuilder sbDelete = new StringBuilder();
            sbDelete.append("DELETE FROM ");
            sbDelete.append(UsuarioConstantes.USUARIO_TABLE_NAME);
            sbDelete.append(" WHERE usuario_id = ?");
            stmtDelete = conn.prepareStatement(sbDelete.toString());
            stmtDelete.setInt(1, id);
            int rows = stmtDelete.executeUpdate();
            if (rows != 1) {
                throw new SQLException("executeUpdate return value: " + rows);
            }
        } catch (SQLException ex) {
            log.error(ex);
            throw new DAORuntimeException(ex);
        } finally {
            UsuarioUtil.closeStatement(stmtDelete);
            UsuarioUtil.closeJDBCConnection(conn);
        }
    }
    
    @Override
    public Usuario criaUsuario(final String nome, final String sobrenome) {
        Usuario result = null;
        PreparedStatement stmtInsert = null;
        Connection conn = UsuarioUtil.getConnection();
        
        try {
            int usuario_id = UsuarioUtil.getUniqueUsuarioId(conn);
            StringBuilder sbInsert = new StringBuilder();
            sbInsert.append("INSERT INTO ");
//            TODO: continuar daqui
        } catch (Exception e) {
        }
    }
    
    public void updateUsuario(int id, String nome, String sobrenome) {
    }
    
    public void close(){
    }
    
    public boolean isClosed() {
    }
    
    public Collection buscaTodosUsuarios() {
    }
}
