package com.prontmed.projeto.repositorios;
import com.prontmed.projeto.entidades.NovoProntuario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface NovoProntuarioRepositorio extends JpaRepository<NovoProntuario,Long>  {
    //classe que possui um metodo abstrato que salva a entidade novoProntuario no banco de dados descrito nas propriedades do application.yml

}
