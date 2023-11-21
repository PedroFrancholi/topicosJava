package com.PedroFrancholi.Java.service;

import com.PedroFrancholi.Java.modelo.Classificacao;
import com.PedroFrancholi.Java.repository.ClassificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificacaoService {
    @Autowired
    private ClassificacaoRepository repository;

    public List<Classificacao> buscaClassificacao(){
        return repository.findAll();
    }
}
