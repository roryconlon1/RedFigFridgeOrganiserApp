package com.redfig.example.redfigfridge.repositories;

import com.redfig.example.redfigfridge.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
