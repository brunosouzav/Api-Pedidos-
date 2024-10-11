package com.cursoUdemy.apiTeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoUdemy.apiTeste.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
