package com.PedroFrancholi.Java.service;

import com.PedroFrancholi.Java.modelo.Venda;
import com.PedroFrancholi.Java.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    public List<Venda> listaVenda (){
        return repository.findAll();
    }

    public Venda gravaVenda(Venda venda){
        return repository.save(venda);
    }

}
