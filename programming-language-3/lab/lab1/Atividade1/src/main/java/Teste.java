import java.util.ArrayList;
import java.util.List;
import mack.controllers.impl.ListaUsuariosController;
import mack.entities.Usuario;

public class Teste {
    
    public static void main(String[] args) {
        ListaUsuariosController lu = new ListaUsuariosController();
        for (Object u: lu.getUsuarios()) {
            System.out.println(u);
        }
        
    }
}
