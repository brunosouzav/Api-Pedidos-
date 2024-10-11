package com.cursoUdemy.apiTeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cursoUdemy.apiTeste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
