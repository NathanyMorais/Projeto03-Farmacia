package com.generation.farmacia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	public List <Product> findAllByNameContainingIgnoreCase(@Param("name") String name);

}
