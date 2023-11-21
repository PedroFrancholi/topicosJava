package com.PedroFrancholi.Java.service;

import com.PedroFrancholi.Java.modelo.Pessoa;
import com.PedroFrancholi.Java.modelo.Veiculo;
import com.PedroFrancholi.Java.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

//    public Pessoa gravaPessoa(Pessoa pessoa){
//        return repository.save(pessoa);
//    }
    public Pessoa gravaPessoa(Pessoa pessoa){
        if(!pessoa.getVeiculos().isEmpty()){
            for(Veiculo v : pessoa.getVeiculos()){
                v.setPessoa(pessoa);
        }
        return repository.save(pessoa);

    }

    return repository.save(pessoa);
}
    public List<Pessoa> buscaPessoas(){
        return repository.findAll();
    }

    public Optional<Pessoa> buscaIndivual(Long id){
        return repository.findById(id);
    }

    public void deletePessoa(Optional<Pessoa> pessoa){
        repository.delete(pessoa.get());
    }
}
