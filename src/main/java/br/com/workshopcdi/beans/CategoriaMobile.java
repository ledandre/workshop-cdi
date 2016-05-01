package br.com.workshopcdi.beans;

import br.com.workshopcdi.interfaces.Categoria;

public enum CategoriaMobile implements Categoria {
    TELEVISORES("TVs"),
    ELETRODOMÉSTICOS("Eletro"),
    INFORMATICA("Info");

    private String descricao;

    private CategoriaMobile(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }
}