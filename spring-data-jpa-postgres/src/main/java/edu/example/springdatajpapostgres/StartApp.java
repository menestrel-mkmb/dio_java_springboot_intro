package edu.example.springdatajpapostgres;

import edu.example.springdatajpapostgres.repository.UserRepository;
import edu.example.springdatajpapostgres.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();

        user.setName("Michael Kevin");
        user.setUsername("michael");
        user.setPassword("plaintext");
        userRepo.save(user);

        for(User u: userRepo.findAll()){
            System.out.println(u);
        }
    }
}
