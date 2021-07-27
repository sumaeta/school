package com.api.school.system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String nota;

    public Aluno() {
    }

    public Aluno(String nome, String dataNascimento, String nota) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id.equals(aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
