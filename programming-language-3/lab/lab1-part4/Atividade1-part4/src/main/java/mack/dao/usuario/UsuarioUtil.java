package mack.dao.usuario;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public final class UsuarioUtil {
    private static final Log log = LogFactory.getLog(UsuarioUtil.class);

    public static int getUniqueUsuarioId(final Connection conn)
        throws java.sql.SQLException {
        int id;
        Statement stmtSelect = null;
        ResultSet rs = null;

        StringBuilder sbSelect = new StringBuilder();

        sbSelect.append("SELECT currentvalue FROM SYS.SYSSEQUENCE WHERE SEQUENCENAME='");
        sbSelect.append(UsuarioConstantes.USUARIO_ID_SEQUENCE_NAME.toUpperCase());

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
    }

    private UsuarioUtil() {}

    public static Connection getConnection() {
        Connection conn = null;
        DataSource ds = null;

        // TODO: parei aqui

        return conn;
    }
}
