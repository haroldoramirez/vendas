package br.com.haroldo.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MainConfiguration {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("RODANDO NA CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

}
