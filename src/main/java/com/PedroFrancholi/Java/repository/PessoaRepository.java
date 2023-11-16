package com.PedroFrancholi.Java.repository;

import com.PedroFrancholi.Java.modelo.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
