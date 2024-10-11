package com.cursoUdemy.apiTeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoUdemy.apiTeste.entities.OrderItem;
import com.cursoUdemy.apiTeste.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
