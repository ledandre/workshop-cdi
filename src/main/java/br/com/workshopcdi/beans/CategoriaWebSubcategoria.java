package br.com.workshopcdi.beans;

import br.com.workshopcdi.interfaces.Categoria;

public enum CategoriaWebSubcategoria implements Categoria {

    SMART_TV("Televisores > SmartTV"),
    TELEVISOR_LED("Televisores > LED"),
    MICROONDAS("Eletrodomésticos > Microondas"),
    CAFETEIRA("Quero café! > Cafeteiras"),
    NOTEBOOK("Informática > Notebooks");

    private String descricao;

    private CategoriaWebSubcategoria(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }
}