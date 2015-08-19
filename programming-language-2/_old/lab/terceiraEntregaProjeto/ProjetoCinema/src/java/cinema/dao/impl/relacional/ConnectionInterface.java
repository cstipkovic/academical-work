package cinema.dao.impl.relacional;

import java.sql.Connection;

/**
 *
 * @author cstipkovic
 */
public interface ConnectionInterface {

    Connection getConnection();
    void close();
}
