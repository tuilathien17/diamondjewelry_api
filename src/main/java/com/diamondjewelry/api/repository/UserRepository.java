package com.diamondjewelry.api.repository;

import com.diamondjewelry.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmailAndRole(String email, String role);
    boolean existsByEmailAndRole(String email, String role);
}