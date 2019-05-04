package com.ifsp.controledeestagio.interfaces;

import com.ifsp.controledeestagio.modelo.entidades.FuncionarioIfsp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioIfsp, Long> {
}
