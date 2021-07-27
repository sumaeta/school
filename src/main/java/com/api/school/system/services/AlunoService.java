package com.api.school.system.services;

import com.api.school.system.entities.Aluno;
import com.api.school.system.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }
}
