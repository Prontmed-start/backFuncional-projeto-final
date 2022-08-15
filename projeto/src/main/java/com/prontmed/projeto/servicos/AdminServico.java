package com.prontmed.projeto.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prontmed.projeto.entidades.Admin;
import com.prontmed.projeto.repositorios.AdminRepositorio;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServico {

    @Autowired
    private AdminRepositorio adminRepositorio;

    public void salvaAdmin(final Admin admin) {
        adminRepositorio.save(admin);
    }

    public Admin login(final Admin adminRequest) {
        final List<Admin> todos = adminRepositorio.findAll();
        //string filter está filtrando na lista o objeto com o mesmo email e senha
        final List<Admin> usarioLogado =
                todos.stream().filter(admin -> admin.getEmail().equals(adminRequest.getEmail()) && admin.getSenha().equals(adminRequest.getSenha())).collect(Collectors.toList());
        if(usarioLogado.isEmpty()){
            return null;
        }else{
            return usarioLogado.get(0);
        }
    }


}

