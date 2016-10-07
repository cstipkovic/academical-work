package mack.dao.usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.activation.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class UsuarioUtil {
    
    static final private Log log = LogFactory.getLog(UsuarioUtil.class);
    
    private UsuarioUtil() {}
    
    static public int getUniqueUsuarioId(final Connection conn) 
        throws java.sql.SQLException {
        int id;
        
        Statement stmtSelect = null;
        ResultSet rs = null;
        
        StringBuilder sbSelect = new StringBuilder();
        
        sbSelect.append("SELECT currentvalue FROM SYS.SYSSEQUENCES WHERE SEQUENCENAME='");
        sbSelect.append(UsuarioConstantes.USUARIO_ID_SEQUENCE_NAME.toUpperCase());
        sbSelect.append("'");
        
        try {
            stmtSelect = conn.createStatement();
            log.info("Executando a query: " + sbSelect.toString());
            rs = stmtSelect.executeQuery(sbSelect.toString());
            if (rs.next()) {
                log.info("OK");
            } else {
                log.info("NOK");
            }
            
            long aux = rs.getLong(1);
            id = (int) aux;
            id++;
        } finally {
            UsuarioUtil.closeStatement(stmtSelect);
            UsuarioUtil.closeResultSet(rs);
        }
        
        return id;
    }
    
    static public Connection getConnection() {
        Connection conn = null;
        DataSource ds = null;
        
        try {
            // TODO: continuar aqui
        } catch (Exception e) {
        }
    }
}
