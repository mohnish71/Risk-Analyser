package com.mg7.RiskAnalyser.repository;

import com.mg7.RiskAnalyser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{


    // find user by email
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}


