package com.ifsp.controledeestagio.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class FuncionarioIfsp extends Pessoa{

    private Boolean isAdmin;

    public FuncionarioIfsp() {
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
