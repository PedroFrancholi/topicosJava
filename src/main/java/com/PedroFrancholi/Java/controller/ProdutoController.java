package com.PedroFrancholi.Java.controller;

import com.PedroFrancholi.Java.modelo.Produto;
import com.PedroFrancholi.Java.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping()
    public ResponseEntity<List<Produto>> buscaProduto(){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscaProduto());
    }
}
