package com.ifsp.controledeestagio.controle;

import com.ifsp.controledeestagio.interfaces.AlunoRepository;
import com.ifsp.controledeestagio.interfaces.FuncionarioRepository;
import com.ifsp.controledeestagio.modelo.entidades.FuncionarioIfsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class ControleAluno {

    private AlunoRepository alunoRepository;
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    public ControleAluno(AlunoRepository alunoRepository, FuncionarioRepository funcionarioRepository) {
        this.alunoRepository = alunoRepository;
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    public FuncionarioIfsp getAluno() {
//        Aluno aluno = new Aluno();
//        aluno.setNome("Thon");
//
//        FuncionarioIfsp funcionario = new FuncionarioIfsp();
//        funcionario.setNome("Ediplo");
//        aluno.setSupervisor(funcionario);
//
//
//        funcionarioRepository.save(funcionario);
//        alunoRepository.save(aluno);

        return funcionarioRepository.findById(7L).orElse(null);
    }
}
