package com.generation.farmacia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<User> findByUserName(String userName);
}
