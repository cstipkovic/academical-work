package banco.dao.impl.relacional;

import java.sql.Connection;

public interface ConexaoInterface {
    Connection getConnection();
    void close();
}
