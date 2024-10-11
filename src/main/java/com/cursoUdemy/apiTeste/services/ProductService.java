package com.cursoUdemy.apiTeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoUdemy.apiTeste.entities.Product;
import com.cursoUdemy.apiTeste.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository ProductRepository;
	
	
	public List<Product> findAll (){
		return ProductRepository.findAll();
	}

	public Product FindById(Long id) {
		Optional<Product> obj = ProductRepository.findById(id);
		return obj.get();
	}

}
