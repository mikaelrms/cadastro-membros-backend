package com.ipbc.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipbc.cadastro.model.Membro;

public interface MembroRepository extends JpaRepository<Membro, Long> {

}
