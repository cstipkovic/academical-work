package ejb.cliente;

import ejb.beans.MeuBeanRemote;
import ejb.domain.Item;
import java.util.Collection;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClienteEJBRemoto {

    public static void main(String[] args) throws Exception {
        executaRemotamenteMeuBean();
    }

    private static void executaRemotamenteMeuBean() throws NamingException {
        final MeuBeanRemote meuBeanRemote = lookupMeuBeanRemote();
        Item item;
        for (int i = 1; i <= 10; i++) {
            item = new Item();
            item.setId(i);
            item.setDescricao("Descricao item #" + i);
            meuBeanRemote.addItem(item);
        }
        Collection<Item> items = meuBeanRemote.getItems();
        for (Item i : items) {
            System.out.println(i.getId() + ":" + i.getDescricao());
        }
    }

    private static MeuBeanRemote lookupMeuBeanRemote() throws NamingException {
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        final Context context = new InitialContext(jndiProperties);
        final String appName = "AppEJB";
        final String moduleName = "MeuModuloEJB";
        final String beanName = "MeuBean";
        final String viewClassName = MeuBeanRemote.class.getName();
        return (MeuBeanRemote) context.lookup("ejb:" + appName + "/" + moduleName + "/"
                + beanName + "!" + viewClassName + "?stateful");
    }
}
