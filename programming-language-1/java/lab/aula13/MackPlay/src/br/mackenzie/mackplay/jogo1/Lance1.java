package br.mackenzie.mackplay.jogo1;

import br.mackenzie.mackplay.main.Lance;

public class Lance1 implements Lance {
    
    private String descricao;
    private int id;
    private String regra;

    public Lance1(String descricao, int id, String regra) {
        this.descricao = descricao;
        this.id = id;
        this.regra = regra;
    }
    
    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getRegra() {
        return regra;
    }
}
