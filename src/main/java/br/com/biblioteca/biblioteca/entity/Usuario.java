package br.com.biblioteca.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;
@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;

    @OneToMany(mappedBy = "usuario")
    private List<Emprestimo> emprestimos;


}
