package br.com.workshopcdi.beans;

import br.com.workshopcdi.interfaces.Categoria;

public enum CategoriaWeb implements Categoria {

    TELEVISORES("Televisores"),
    ELETRODOMÉSTICOS("Eletrodomésticos"),
    INFORMATICA("Informática");

    private String descricao;

    private CategoriaWeb(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }
}