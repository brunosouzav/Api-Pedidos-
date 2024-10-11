package com.cursoUdemy.apiTeste.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoUdemy.apiTeste.entities.User;
import com.cursoUdemy.apiTeste.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll (){
		return userRepository.findAll();
	}

	public User FindById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
	
	public User insert (User obj) {
		return userRepository.save(obj);
	}
	
	
	
}
