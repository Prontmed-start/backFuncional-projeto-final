package com.prontmed.projeto.servicos;


import com.prontmed.projeto.entidades.Paciente;
import com.prontmed.projeto.repositorios.NovoPacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServico {

    @Autowired
    NovoPacienteRepositorio repositorio;

    
    public void salvaPaciente(final Paciente paciente) {
        repositorio.save(paciente);
    }

}

