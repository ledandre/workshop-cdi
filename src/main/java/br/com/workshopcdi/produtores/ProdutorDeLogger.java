package br.com.workshopcdi.produtores;

import javax.enterprise.inject.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.workshopcdi.core.Application;

public class ProdutorDeLogger {

//    @Produces
    public Logger criaLogger() {
        return LoggerFactory.getLogger(Application.class);
    }
}