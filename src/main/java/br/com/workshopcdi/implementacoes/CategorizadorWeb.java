package br.com.workshopcdi.implementacoes;

import java.util.HashMap;

import br.com.workshopcdi.beans.CategoriaWeb;
import br.com.workshopcdi.beans.Produto;
import br.com.workshopcdi.interfaces.Categoria;
import br.com.workshopcdi.interfaces.Categorizador;

public class CategorizadorWeb implements Categorizador {

    protected HashMap<String, Categoria> categoriaMap;

    public CategorizadorWeb() {
        categoriaMap = new HashMap<String, Categoria>();
        categoriaMap.put("Televisor", CategoriaWeb.TELEVISORES);
        categoriaMap.put("SmartTV", CategoriaWeb.TELEVISORES);
        categoriaMap.put("Microondas", CategoriaWeb.ELETRODOMÉSTICOS);
        categoriaMap.put("Cafeteira", CategoriaWeb.ELETRODOMÉSTICOS);
        categoriaMap.put("Notebook", CategoriaWeb.INFORMATICA);
    }

    @Override
    public void categoriza(Produto produto) {
        categoriaMap.forEach((keyword, categoria) -> {
            if (produto.getName().toLowerCase().contains(keyword.toLowerCase())) {
                produto.setCategoria(categoria);
                return;
            }
        });
    }
}