package br.com.workshopcdi.repositories;

import java.util.Arrays;
import java.util.List;

import br.com.workshopcdi.beans.Produto;

public class ProdutosRepository {

    public List<Produto> list() {
        return Arrays.asList(
                new Produto(101010, "Televisor 40\" Samsung LED"),
                new Produto(112010, "SmartTV 55\" LG"),
                new Produto(542220, "Microondas Brastemp 30L"),
                new Produto(992520, "Cafeteira Dolce Gusto"),
                new Produto(502030, "Notebook ASUS Core i7"));
    }
}