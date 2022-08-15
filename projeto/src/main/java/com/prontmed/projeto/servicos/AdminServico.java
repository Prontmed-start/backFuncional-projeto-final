package com.prontmed.projeto.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prontmed.projeto.entidades.Admin;
import com.prontmed.projeto.repositorios.AdminRepositorio;

@Service
public class AdminServico {

    @Autowired
    private AdminRepositorio adminRepositorio;

    public void salvaAdmin(final Admin admin) {
        adminRepositorio.save(admin);
    }

}

