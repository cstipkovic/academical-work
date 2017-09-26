package mack.dao.usuario;
final class UsuarioConstantes {
    static public final String URL = "jdbc:derby://localhost:1527/meuDB";
    static public final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static public final String USER = "me";
    static public final String PASSWORD = "pass";
    static public final String USUARIO_TABLE_NAME = "tb_usuario";
    static public final String USUARIO_ID_SEQUENCE_NAME = "usuario_id_sequence";
    private UsuarioConstantes() {
    }
}