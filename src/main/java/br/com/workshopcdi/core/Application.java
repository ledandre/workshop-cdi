package br.com.workshopcdi.core;

import java.util.List;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import br.com.workshopcdi.beans.Produto;
import br.com.workshopcdi.interfaces.Categorizador;
import br.com.workshopcdi.repositories.ProdutosRepository;

public class Application {

    @Inject private Categorizador categorizador;
    @Inject private ProdutosRepository produtosRepository;

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        Application application = container.instance().select(Application.class).get();
        application.run();
        weld.shutdown();
    }

    private void run() {
        List<Produto> produtos = produtosRepository.list();

        produtos.forEach(produto -> {
            categorizador.categoriza(produto);
            System.out.println(produto);
            System.out.println("============================================");
        });
    }
}