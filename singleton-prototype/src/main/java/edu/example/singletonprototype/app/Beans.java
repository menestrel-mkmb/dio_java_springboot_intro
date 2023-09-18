package edu.example.singletonprototype.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }

    @Bean
    public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
        return args -> {
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();
            sistema.enviarConfirmacaoCadastro();
        };
    }
}
