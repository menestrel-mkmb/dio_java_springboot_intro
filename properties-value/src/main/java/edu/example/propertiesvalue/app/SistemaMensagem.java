package edu.example.propertiesvalue.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Value("${name:ValueNotFound}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefone;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome +
                "\ne-mail: " + email +
                "\ntelefone: " + telefone);
        System.out.println("Seu cadastro foi aprovado");
    }
}
