package br.com.projeto.exemplo03.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alunos")
@Getter
@Setter
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String nome;
    @ManyToMany
    @JoinTable(
            name = "tabela_auxiliar",
            joinColumns = {@JoinColumn(name = "codigo_aluno", referencedColumnName = "codigo")},
            inverseJoinColumns = {@JoinColumn(name = "codigo_curso", referencedColumnName = "codigo")}
    )
    private List<Curso> cursos = new ArrayList<>();
}
