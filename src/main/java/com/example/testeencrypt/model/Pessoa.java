package com.example.testeencrypt.model;

import com.example.testeencrypt.converts.CryptoConverter;
import lombok.Getter;

import javax.persistence.*;

@Table(name = "Pessoa", indexes = @Index(name = "cpf_IDX", columnList = "cpf"))
@Entity
@Getter
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String nome;

    @Column(unique = true)
    @Convert(converter = CryptoConverter.class)
    private String cpf;
}
