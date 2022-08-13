package com.prontmed.projeto.repositorios;

import com.prontmed.projeto.entidades.Login;

import org.springframework.data.repository.CrudRepository;

public interface LoginRepositorio extends CrudRepository<Login,Integer> {
        //classe que possui um metodo abstrato que salva a entidade novoProntuario no banco de dados descrito nas propriedades do application.yml


}
