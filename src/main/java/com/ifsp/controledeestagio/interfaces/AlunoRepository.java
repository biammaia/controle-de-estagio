package com.ifsp.controledeestagio.interfaces;

import com.ifsp.controledeestagio.modelo.entidades.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
