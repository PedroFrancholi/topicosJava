package com.PedroFrancholi.Java.controller;

import com.PedroFrancholi.Java.modelo.Venda;
import com.PedroFrancholi.Java.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaContoller {

    @Autowired
    private VendaService service;

    @GetMapping()
    public ResponseEntity<List<Venda>> listaVenda(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listaVenda());
    }

    @PostMapping()
    public ResponseEntity<Object> gravaVenda(Venda venda){
        return ResponseEntity.status(HttpStatus.OK).body(service.gravaVenda(venda));
    }
}
