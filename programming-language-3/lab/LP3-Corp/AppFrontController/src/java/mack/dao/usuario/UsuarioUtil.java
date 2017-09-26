package mack.dao.usuario;
import mack.entities.Usuario;
import java.sql.*;
import java.util.Collection;
import javax.sql.*;
import mack.dao.exception.DAORuntimeException;
import org.apache.commons.logging.*;
public final class UsuarioUtil {
    static final private Log log = LogFactory.getLog(UsuarioUtil.class);
    static public int getUniqueUsuarioId(final Connection conn)
            throws java.sql.SQLException {
        int id;
        Statement stmtSelect = null;
        ResultSet rs = null;
        StringBuilder sbSelect = new StringBuilder();
        sbSelect.append(
        "SELECT currentvalue FROM SYS.SYSSEQUENCES WHERE SEQUENCENAME = '");
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
    private UsuarioUtil() {
// this constructor is intentionally private
    }
    static public Connection getConnection() throws DAORuntimeException {
        Connection conn = null;
        DataSource ds = null;
        try {
            Class.forName(UsuarioConstantes.DRIVER).newInstance();
            conn = DriverManager.getConnection(UsuarioConstantes.URL,
                    UsuarioConstantes.USER,
                    UsuarioConstantes.PASSWORD);
        } catch (ClassNotFoundException ex) {
            throw new DAORuntimeException(ex);
        } catch (InstantiationException e) {
            throw new DAORuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new DAORuntimeException(e);
        } catch (SQLException e) {
            throw new DAORuntimeException(e);
        }
        return conn;
    }
    public static void closeJDBCConnection(final Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                log.error(conn, ex);
            }
        }
    }
    public static void closeStatement(final Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                log.error(stmt, ex);
            }
        }
    }
    public static void closeResultSet(final ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                log.error(rs, ex);
            }
        }
    }
    static public Collection makeUsuarioObjectsFromResultSet(final ResultSet rs)
            throws java.sql.SQLException {
        Collection result = new java.util.ArrayList();
        while (rs.next()) {
            int id = rs.getInt("usuario_id");
            String nome = rs.getString("nome");
            String sobrenome = rs.getString("sobrenome");
            Usuario u = new Usuario(id, nome, sobrenome);
            result.add(u);
        }
        return result;
    }
}