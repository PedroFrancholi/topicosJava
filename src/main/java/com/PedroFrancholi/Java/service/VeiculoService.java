package com.PedroFrancholi.Java.service;

import com.PedroFrancholi.Java.modelo.Veiculo;
import com.PedroFrancholi.Java.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public Veiculo gravaVeiculo(Veiculo veiculo){
        return repository.save(veiculo);
    }

    public List<Veiculo> buscarTudo(){
        return repository.findAll();
    }

    public Optional<Veiculo> buscaId(Long id){
        return repository.findById(id);
    }

    public void deleteVeiculo(Optional<Veiculo> veiculo){
        repository.delete(veiculo.get());
    }
}
