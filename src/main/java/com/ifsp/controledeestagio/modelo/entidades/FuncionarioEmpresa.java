package com.ifsp.controledeestagio.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class FuncionarioEmpresa extends Pessoa{
    @ManyToOne
    private Empresa empresa;

    public FuncionarioEmpresa() {
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
