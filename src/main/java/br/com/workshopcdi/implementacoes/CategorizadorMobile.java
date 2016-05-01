package br.com.workshopcdi.implementacoes;

import java.util.HashMap;

import br.com.workshopcdi.anotacoes.Mobile;
import br.com.workshopcdi.beans.CategoriaMobile;
import br.com.workshopcdi.beans.Produto;
import br.com.workshopcdi.interfaces.Categoria;
import br.com.workshopcdi.interfaces.Categorizador;

@Mobile
public class CategorizadorMobile implements Categorizador {

    private HashMap<String, Categoria> categoriaMap;

    public CategorizadorMobile() {
        categoriaMap = new HashMap<String, Categoria>();
        categoriaMap.put("Televisor", CategoriaMobile.TELEVISORES);
        categoriaMap.put("SmartTV", CategoriaMobile.TELEVISORES);
        categoriaMap.put("Microondas", CategoriaMobile.ELETRODOMÉSTICOS);
        categoriaMap.put("Cafeteira", CategoriaMobile.ELETRODOMÉSTICOS);
        categoriaMap.put("Notebook", CategoriaMobile.INFORMATICA);
    }

    @Override
    public void categoriza(Produto produto) {
        categoriaMap.forEach((keyword, categoria) -> {
            if (produto.getName().toLowerCase().contains(keyword.toLowerCase())) {
                produto.setCategoria(categoria);
            }
        });
    }
}