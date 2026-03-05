package com.jefferson.aprendendo_spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // Insere todos os Getters
@Setter // Insere todos os Setters
@AllArgsConstructor // Insere construtor com todos os argumentos
@NoArgsConstructor // Insere construtor sem argumentos

public class Usuario {
    private String nome;
    private String email;
    private String senha;
}
