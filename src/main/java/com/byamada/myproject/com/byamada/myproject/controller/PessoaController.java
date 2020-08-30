package com.byamada.myproject.com.byamada.myproject.controller;

import com.byamada.myproject.com.byamada.myproject.core.dao.model.Pessoa;
import com.byamada.myproject.com.byamada.myproject.service.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping
    public ResponseEntity<List<Pessoa>> listar(){
        return ResponseEntity.ok().body(service.listar());
    }

    @PostMapping
    public ResponseEntity<Pessoa> add(@RequestBody Pessoa pessoa){
        return ResponseEntity.ok().body(service.add(pessoa));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Pessoa> listarId(@PathVariable("id") int id){
        return ResponseEntity.ok().body(service.listarId(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Void> edit(@RequestBody Pessoa pessoa, @PathVariable("id")int id){
        pessoa.setId(id);
        service.edit(pessoa);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
