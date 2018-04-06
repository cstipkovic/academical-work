package servidordados;

import javax.ejb.Singleton;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import services.Banco;

@Singleton
@Path("operacoes")
public class Operacoes {

    @Context
    private UriInfo context;
    
    private final Banco banco;
    
    /**
     * Creates a new instance of servidordedados
     */
    public Operacoes() {
        banco = new Banco();
    }

    /**
     * Retrieves representation of an instance of servidordados.Operacoes
     * @param conta
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Path("/saldo/{conta}")
    public String getSaldo(@PathParam("conta") String conta) {
        System.out.println("Servidor de Dados - Enviado saldo da conta com o valor de " + conta);
        return banco.saldo(Integer.parseInt(conta)).toString();
    }


    /**
     * PUT method for updating or creating an instance of Operacoes
     * @param conta
     * @param valor
     */
    @GET
    @Produces("text/plain")
    @Path("/setSaldo/{conta}/{valor}")
    public void setSaldo(@PathParam("conta") String conta, @PathParam("valor") String valor) {
        System.out.println("Servidor de Dados - entrou no setSaldo");
        banco.deposito(Integer.parseInt(conta), Float.parseFloat(valor));
        System.out.println("Servidor de Dados - Alterado saldo da conta para o valor de " + valor);
    }
    
    @GET
    @Produces("text/plain")
    @Path("/saque/{conta}/{valor}")
    public void saque(@PathParam("conta") String conta, @PathParam("valor") String valor) {
        System.out.println("Servidor de Dados - entrou no Saque");
        banco.saque(Integer.parseInt(conta), Float.parseFloat(valor));
        System.out.println("Servidor de Dados - Retirado saldo da conta para no valor de " + valor);
    }
    
    @GET
    @Produces("text/plain")
    @Path("/transferencia/{conta1}/{conta2}/{valor}")
    public void transferencia(@PathParam("conta1") String conta1,@PathParam("conta2") String conta2, @PathParam("valor") String valor) {
        System.out.println("Servidor de Dados - entrou no Transferência");
        banco.transferencia(Integer.parseInt(conta1),Integer.parseInt(conta2), Float.parseFloat(valor));
        System.out.println("Servidor de Dados - Retirado saldo da conta para no valor de " + valor);
    }

}
