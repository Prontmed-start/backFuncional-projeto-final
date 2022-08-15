package com.prontmed.projeto.repositorios;

import com.prontmed.projeto.entidades.Admin;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepositorio extends JpaRepository<Admin,Long> {
        //classe que possui um metodo abstrato que salva a entidade novoProntuario no banco de dados descrito nas propriedades do application.yml


}
