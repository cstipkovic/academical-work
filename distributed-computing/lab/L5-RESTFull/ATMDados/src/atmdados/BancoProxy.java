package atmdados;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

public class BancoProxy {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/ServidorDados/webresources";

    public BancoProxy() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("operacoes");
    }

    public String setSaldo(String conta, String valor) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(
                java.text.MessageFormat.format("/setSaldo/{0}/{1}", new Object[]{conta, valor}));
        return resource.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }

    public String getSaldo(String conta) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("/saldo/{0}", new Object[]{conta}));
        return resource.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }

    public String transferencia(String conta1, String conta2, String valor) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(
                java.text.MessageFormat.format("/transferencia/{0}/{1}/{2}", new Object[]{conta1, conta2, valor}));
        return resource.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }
    
     public String saque(String conta, String valor) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(
                java.text.MessageFormat.format("/saque/{0}/{1}", new Object[]{conta, valor}));
        return resource.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }

    public void close() {
        client.close();
    }
}
