package com.mb.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mb.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
