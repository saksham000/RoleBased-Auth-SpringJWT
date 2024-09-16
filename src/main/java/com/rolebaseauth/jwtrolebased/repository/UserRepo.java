package com.rolebaseauth.jwtrolebased.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rolebaseauth.jwtrolebased.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    
    Optional<User> findByEmail(String email);   


}
