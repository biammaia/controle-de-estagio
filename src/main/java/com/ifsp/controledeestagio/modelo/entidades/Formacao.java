package com.ifsp.controledeestagio.modelo.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Formacao implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String area;
    private String descricao;
    private Date conclusao;
    private Long horasTotais;
    @ManyToOne
    private Aluno aluno;

    public Formacao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getConclusao() {
        return conclusao;
    }

    public void setConclusao(Date conclusao) {
        this.conclusao = conclusao;
    }

    public Long getHorasTotais() {
        return horasTotais;
    }

    public void setHorasTotais(Long horasTotais) {
        this.horasTotais = horasTotais;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
