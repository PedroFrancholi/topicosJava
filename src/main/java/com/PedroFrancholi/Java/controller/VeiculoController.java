package com.PedroFrancholi.Java.controller;

import com.PedroFrancholi.Java.modelo.Veiculo;
import com.PedroFrancholi.Java.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    @Autowired
    private VeiculoService service;
    @PostMapping
    public ResponseEntity<Object> gravarVeiculo(@RequestBody Veiculo veiculo){
        return ResponseEntity.status(HttpStatus.OK).body(service.gravaVeiculo(veiculo));
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> buscarTudo(){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscarTudo());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Veiculo>> buscaID(@PathVariable(value = "id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscaId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> alteraVeiculo(@PathVariable(value = "id") Long id, @RequestBody Veiculo veiculo){
        Optional<Veiculo> veiculoExist = service.buscaId(id);

        if(veiculoExist.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body("Não localizado!");
        }

        Veiculo newVeiculo = veiculoExist.get();
        newVeiculo.setModelo(veiculo.getModelo());
        newVeiculo.setMarca(veiculo.getMarca());
        newVeiculo.setCor(veiculo.getCor());

        return ResponseEntity.status(HttpStatus.OK).body(service.gravaVeiculo(newVeiculo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletaVeiculo(@PathVariable(value = "id") Long id){
        Optional<Veiculo> veiculoExist = service.buscaId(id);

        if(veiculoExist.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body("Não localizado!");
        }

        service.deleteVeiculo(veiculoExist);
        return ResponseEntity.status(HttpStatus.OK).body("Veiculo Deletado!");
    }

}
