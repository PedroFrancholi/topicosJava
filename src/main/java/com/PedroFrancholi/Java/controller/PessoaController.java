package com.PedroFrancholi.Java.controller;

import com.PedroFrancholi.Java.modelo.Pessoa;
import com.PedroFrancholi.Java.modelo.Veiculo;
import com.PedroFrancholi.Java.service.PessoaService;
import com.PedroFrancholi.Java.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity<Object> gravarPessoa(@RequestBody Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.OK).body(service.gravaPessoa(pessoa));
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> buscaPessoas(){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscaPessoas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pessoa>> buscaIndividual(@PathVariable (value = "id") Long id){

        return ResponseEntity.status(HttpStatus.OK).body(service.buscaIndivual(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> alteraPessoa(@PathVariable (value = "id") Long id, @RequestBody Pessoa pessoa){
        Optional<Pessoa> pessoaExist = service.buscaIndivual(id);

        if(pessoaExist.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body("Dado não encontrado!");
        }

        Pessoa newPesssoa = pessoaExist.get();
        newPesssoa.setNome(pessoa.getNome());
        newPesssoa.setCpf(pessoa.getCpf());
        newPesssoa.setSexo(pessoa.getSexo());

        return ResponseEntity.status(HttpStatus.OK).body(service.gravaPessoa(newPesssoa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePessoa(@PathVariable(value = "id") Long id){
        Optional<Pessoa> pessoaExist = service.buscaIndivual(id);

        if(pessoaExist.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body("Dado não encontrado!");
        }

        service.deletePessoa(pessoaExist);
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso!");
    }
}
