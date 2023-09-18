package edu.example.springdatajpapostgres.repository;

import edu.example.springdatajpapostgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
