package com.prontmed.projeto.servicos;

import com.prontmed.projeto.entidades.NovoProntuario;
import com.prontmed.projeto.repositorios.NovoProntuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//anotação que é o conjunto de 4 outras anotações indica que a classe representa um serviço (pesquisar o que é um serviço)
public class NovoProntuarioServico {

    @Autowired// Instancia o objeto NovoProntuarioRepositorio
    NovoProntuarioRepositorio repositorio; //objeto instaciado pelo autowired e que possui os metodos basicos de crud

    //metodo chamado pelo resources que linka o repository com o resourcces
    public void salvaProntuario(final NovoProntuario novoProntuario) {
        repositorio.save(novoProntuario);
    }

}
