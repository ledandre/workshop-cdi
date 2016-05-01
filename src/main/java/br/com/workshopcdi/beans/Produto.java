package br.com.workshopcdi.beans;

import br.com.workshopcdi.interfaces.Categoria;

public class Produto {

    private Integer codigo;
    private String name;
    private Categoria categoria;

    public Produto(Integer codigo, String name) {
        this.codigo = codigo;
        this.name = name;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("Produto: ")
            .append(this.name)
            .append("\n")
            .append("Categoria: ")
            .append(this.categoria.getDescricao())
            .toString();
    }
}