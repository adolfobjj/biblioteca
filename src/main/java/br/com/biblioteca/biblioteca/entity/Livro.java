package br.com.biblioteca.biblioteca.entity;



import jakarta.persistence.*;
import lombok.Data;


import java.util.List;
@Data
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    @OneToMany(mappedBy = "livro")
    private List<Emprestimo> emprestimos;

}
