package com.cursoUdemy.apiTeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoUdemy.apiTeste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
