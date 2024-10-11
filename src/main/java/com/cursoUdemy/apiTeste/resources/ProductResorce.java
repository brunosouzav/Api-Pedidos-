package com.cursoUdemy.apiTeste.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoUdemy.apiTeste.entities.Product;
import com.cursoUdemy.apiTeste.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResorce {
	
	@Autowired
	private ProductService ProductService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = ProductService.findAll(); 
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = ProductService.FindById(id);
		return ResponseEntity.ok().body(obj);
	}
}
