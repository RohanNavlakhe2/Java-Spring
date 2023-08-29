package com.yog.passwordmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yog.passwordmanager.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
