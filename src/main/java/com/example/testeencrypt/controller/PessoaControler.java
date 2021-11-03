package com.example.testeencrypt.controller;

import com.example.testeencrypt.model.Pessoa;
import com.example.testeencrypt.repositorio.PessoaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PessoaControler {

    private final PessoaRepositorio pessoaRepositorio;

    @PostMapping
    public ResponseEntity<?> savar(@RequestBody Pessoa pessoa) {
        Pessoa save = pessoaRepositorio.save(pessoa);
        return ResponseEntity.ok(save);
    }

    @GetMapping
    public ResponseEntity<?> get() {
        List<Pessoa> all = pessoaRepositorio.findAll();
        return ResponseEntity.ok(all);
    }
}
