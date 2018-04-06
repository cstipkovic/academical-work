/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidordados;

import javax.ejb.Singleton;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author 1077147
 */
@Singleton
@Path("operacoes")
public class Operacoes {

    @Context
    private UriInfo context;

    int conta;    
    
    /**
     * Creates a new instance of servidordedados
     */
    public Operacoes() {
    }

    /**
     * Retrieves representation of an instance of servidordados.Operacoes
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Path("/saldo")
    public String getSaldo() {
        System.out.println("Servidor de Dados - Enviado saldo da conta com o valor de " + conta);
        return Integer.toString(conta);
    }


    /**
     * PUT method for updating or creating an instance of Operacoes
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @GET
    @Produces("text/plain")
    @Path("/setsaldo/{valor}")
    public void setSaldo(@PathParam("valor") String valor_) {
        System.out.println("Servidor de Dados - entrou no setSaldo");
        int valor = Integer.parseInt(valor_);
        conta = valor;
        System.out.println("Servidor de Dados - Alterado saldo da conta para o valor de " + conta);
    }
}
