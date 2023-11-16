package com.PedroFrancholi.Java.repository;

import com.PedroFrancholi.Java.modelo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {
}
