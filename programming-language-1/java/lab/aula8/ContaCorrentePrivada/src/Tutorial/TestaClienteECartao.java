package Tutorial;

public class TestaClienteECartao {
    
    public static void main(String args[]) {
        
        Cliente c = new Cliente();
        CartaoDeCredito cdc = new CartaoDeCredito();
        
        c.nome = "Rafael Cosentino";
        cdc.numero = 111111;
        
        cdc.cliente = c;
        
        System.out.println(cdc.numero);
        System.out.println(cdc.cliente.nome);
    }
}
