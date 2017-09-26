package ejb.domain;

import java.io.Serializable;

public class Item implements Serializable {

    private int id;
    private String descricao;

    public Item() {
        super();
    }

    public Item(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
