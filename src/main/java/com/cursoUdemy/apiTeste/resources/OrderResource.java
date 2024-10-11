package com.cursoUdemy.apiTeste.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoUdemy.apiTeste.entities.Order;
import com.cursoUdemy.apiTeste.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {  // Corrigido de OrderResorce para OrderResource

    @Autowired
    private OrderService orderService;  // Corrigido para orderService

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = orderService.findAll();  // Corrigido para orderService
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = orderService.findById(id);  // Corrigido para findById
        return ResponseEntity.ok().body(obj);
    }
}
