package com.dannygutamafullstack.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dannygutamafullstack.app.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long >{
 
} 