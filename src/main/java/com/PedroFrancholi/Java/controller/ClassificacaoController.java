package com.PedroFrancholi.Java.controller;

import ch.qos.logback.core.joran.event.SaxEventRecorder;
import com.PedroFrancholi.Java.modelo.Classificacao;
import com.PedroFrancholi.Java.service.ClassificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classificacao")
public class ClassificacaoController {
    @Autowired
    private ClassificacaoService service;

    @GetMapping()
    public ResponseEntity<List<Classificacao>> buscaClassificacao(){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscaClassificacao());
    }
}
