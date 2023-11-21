package com.PedroFrancholi.Java.repository;

import com.PedroFrancholi.Java.modelo.Classificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificacaoRepository extends JpaRepository<Classificacao, String> {

}
