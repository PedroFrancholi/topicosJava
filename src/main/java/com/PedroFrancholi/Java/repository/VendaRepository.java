package com.PedroFrancholi.Java.repository;

import com.PedroFrancholi.Java.modelo.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda,Integer>{
}
