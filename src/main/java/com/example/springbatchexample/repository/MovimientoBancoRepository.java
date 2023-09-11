package com.example.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbatchexample.model.MovimientoBanco;

public interface MovimientoBancoRepository extends JpaRepository<MovimientoBanco, Integer> {

}
