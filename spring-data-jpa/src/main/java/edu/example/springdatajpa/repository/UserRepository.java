package edu.example.springdatajpa.repository;

import edu.example.springdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
