package com.ifsp.controledeestagio.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Inscricao implements Serializable {
    @Id
    private Vaga vaga;
    @Id
    private Aluno aluno;

    public Inscricao() {
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
}
