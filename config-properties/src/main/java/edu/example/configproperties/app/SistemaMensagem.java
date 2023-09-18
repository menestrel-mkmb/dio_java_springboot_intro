package edu.example.configproperties.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    private Remetente rem;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + rem.getNome() +
                "\ne-mail: " + rem.getEmail() +
                "\ntelefone: " + rem.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }
}
