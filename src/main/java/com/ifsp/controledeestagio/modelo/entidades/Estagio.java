package com.ifsp.controledeestagio.modelo.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Estagio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Vaga vaga;
    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private FuncionarioIfsp orientador;
    @ManyToOne
    private FuncionarioEmpresa supervisorEmpresa;
    private String descricao;
    private Date inicio;
    private Date fim;

    public Estagio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public FuncionarioIfsp getOrientador() {
        return orientador;
    }

    public void setOrientador(FuncionarioIfsp orientador) {
        this.orientador = orientador;
    }

    public FuncionarioEmpresa getSupervisorEmpresa() {
        return supervisorEmpresa;
    }

    public void setSupervisorEmpresa(FuncionarioEmpresa supervisorEmpresa) {
        this.supervisorEmpresa = supervisorEmpresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }
}
