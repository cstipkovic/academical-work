package ejb.beans;

import ejb.domain.Item;
import java.util.Collection;
import javax.ejb.Remote;

@Remote
public interface MeuBeanRemote {

    void addItem(Item item);

    Collection<Item> getItems();
}
