package com.jefferson.aprendendo_spring.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // Insere todos os Getters
@Setter // Insere todos os Setters
@AllArgsConstructor // Insere construtor com todos os argumentos
@NoArgsConstructor // Insere construtor sem argumentos
@Entity // Diz ao Spring que essa classe é uma tabela
@Table(name = "usuario") // Table para nomear a tabela
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera automaticamente um Id
    private Long id;
    @Column(name = "nome", length = 100)
    private String nome;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "senha", length = 10)
    private String senha;
    @OneToMany(cascade = CascadeType.ALL) // Um para muitos
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")  //Nome que vai constar na coluna de endereços e que vai relacionar um endereço a um usuário
    private List<Endereco> enderecos;
    @OneToMany(cascade = CascadeType.ALL) // Um para muitos
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private List<Telefone> telefones;
}
