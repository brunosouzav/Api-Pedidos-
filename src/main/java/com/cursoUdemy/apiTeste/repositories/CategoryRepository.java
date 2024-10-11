package com.cursoUdemy.apiTeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoUdemy.apiTeste.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
