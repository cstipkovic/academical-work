package ingresso.dao.impl.realacional;

import java.sql.Connection;

public interface ConexaoInterface {
    Connection getConnection();
    void close();
}
