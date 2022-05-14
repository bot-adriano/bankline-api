package com.examplecom.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplecom.dio.santander.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
