package com.PedroFrancholi.Java.service;

import com.PedroFrancholi.Java.modelo.Produto;
import com.PedroFrancholi.Java.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> buscaProduto(){
        return repository.findAll();
    }
}
