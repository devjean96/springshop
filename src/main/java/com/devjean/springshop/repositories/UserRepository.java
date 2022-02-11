package com.devjean.springshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjean.springshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
