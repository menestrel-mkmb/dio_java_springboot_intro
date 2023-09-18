package edu.example.springdatajpapostgres.repository;

import edu.example.springdatajpapostgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByNameContaining(String name);

    User findByUsername(String username);

    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);

}
