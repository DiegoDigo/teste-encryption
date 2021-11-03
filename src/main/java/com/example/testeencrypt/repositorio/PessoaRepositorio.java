package com.example.testeencrypt.repositorio;

import com.example.testeencrypt.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {
}
