package servidordados;

import javax.ejb.Singleton;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Singleton
@Path("operacaoes")
public class Operacoes {

    @Context
    private UriInfo context;
    
    int conta;

    public Operacoes() {
    }

    @GET
    @Produces("text/plain")
    @Path("/saldo")
    public String getSaldo() {
        System.out.println("Servidor de Dados - Enviado saldo da conta com o valor de " + conta);
        
        return Integer.toString(conta);
    }

    @GET
    @Consumes("text/plain")
    @Path("/setsaldo/{valor}")
    public void setSaldo(@PathParam("valor") String valor_) {
        System.out.println("Servidor de Dados - entrou no setSaldo");
        
        int valor = Integer.parseInt(valor_);
        conta = valor;
        
        System.out.println("Servidor de Dados - Alterado saldo da conta para o valor de " + conta);
    }
}
