package com.examplecom.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplecom.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.examplecom.dio.santander.bankline.api.dto.NovoCorrentista;
import com.examplecom.dio.santander.bankline.api.model.Correntista;
import com.examplecom.dio.santander.bankline.api.model.Movimentacao;
import com.examplecom.dio.santander.bankline.api.repository.MovimentacaoRepository;
import com.examplecom.dio.santander.bankline.api.repository.correntistaRepository;
import com.examplecom.dio.santander.bankline.api.service.CorrentistaService;
import com.examplecom.dio.santander.bankline.api.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired 
	//@Autowired para ficar automatico e n precisamors autorizar toda hora
	private MovimentacaoRepository repository;
	
	//ele que sabe as regras do negocio e vai efetuar o save do novo correntista
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
		
	}
	//com isso vamos salvar o usuario
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
		
	}
	

}
