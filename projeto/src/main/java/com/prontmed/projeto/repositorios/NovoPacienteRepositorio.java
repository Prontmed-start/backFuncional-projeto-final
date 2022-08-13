package com.prontmed.projeto.repositorios;
import com.prontmed.projeto.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface NovoPacienteRepositorio extends JpaRepository<Paciente,Long>  {
    //classe que possui um metodo abstrato que salva a entidade Paciente no banco de dados descrito nas propriedades do application.yml

}
