package com.ifsp.controledeestagio.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Aluno extends Pessoa {

    @ManyToOne
    private FuncionarioIfsp supervisor;
    private String curriculo;
    private Boolean ativo;

    public Aluno() {
    }

    public FuncionarioIfsp getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(FuncionarioIfsp supervisor) {
        this.supervisor = supervisor;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
