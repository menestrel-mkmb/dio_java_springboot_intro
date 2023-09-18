package edu.example.springdatajpapostgres;

import edu.example.springdatajpapostgres.repository.UserRepository;
import edu.example.springdatajpapostgres.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userRepo.findByNameContaining("Michael");

        for(User u: users){
            System.out.println(u);
        }
    }

    private void insertUser(String name, String username, String password){
        User user = new User();

        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);

        userRepo.save(user);
    }
}
