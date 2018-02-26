package br.com.teste.netshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;

@SpringBootApplication(exclude = JmsAutoConfiguration.class)
@EnableAutoConfiguration
public class TesteNetshoesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteNetshoesApplication.class, args);
    }
}
