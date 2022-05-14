package com.examplecom.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplecom.dio.santander.bankline.api.dto.NovoCorrentista;
import com.examplecom.dio.santander.bankline.api.model.Correntista;
import com.examplecom.dio.santander.bankline.api.repository.correntistaRepository;
import com.examplecom.dio.santander.bankline.api.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired 
	//@Autowired para ficar automatico e n precisamors autorizar toda hora
	private correntistaRepository repository;
	
	//ele que sabe as regras do negocio e vai efetuar o save do novo correntista
	@Autowired
	private CorrentistaService service;
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
		
	}
	//com isso vamos salvar o usuario
	@PostMapping
	public void save(@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
		
	}
	

}
