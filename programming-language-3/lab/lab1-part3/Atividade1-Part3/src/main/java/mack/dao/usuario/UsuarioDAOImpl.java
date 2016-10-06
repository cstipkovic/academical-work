package mack.dao.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import mack.entities.Usuario;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UsuarioDAOImpl implements UsuarioDAO {
    
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
            
            sbSelect.append("SELECT usuario_id, nome, sobrenome FROM ");
            sbSelect.append(UsuarioConstante.USUARIO_TABLE_NOME);
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
            throw new DAORuntimeException(e);
        } finally {
            UsuarioUtil.closeStatement(stmtSelect);
            UsuarioUtil.closeResultSet(rs);
            UsuarioUtil.closeJDBCConnection(conn);
        }
        
        return result;
    }
}
