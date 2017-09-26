package ejb.beans;

import ejb.domain.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;

@Stateful
public class MeuBean implements MeuBeanRemote {

    private List<Item> items;

    @PostConstruct
    public void init() {
        items = new ArrayList<Item>();
    }

    @PreDestroy
    public void releaseResources() {
        items.clear();
        items = null;
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public Collection<Item> getItems() {
        return items;
    }
}
