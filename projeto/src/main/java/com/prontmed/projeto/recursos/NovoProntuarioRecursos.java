package com.prontmed.projeto.recursos;

import com.prontmed.projeto.entidades.NovoProntuario;
import com.prontmed.projeto.servicos.NovoProntuarioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/")
public class NovoProntuarioRecursos {

    @Autowired//anotação que instancia o objeto
    NovoProntuarioServico novoProntuarioServico;

    //postMapping anotação que indica que recebe request do tipo post(pesquisar tipo de requests e tipo de anotações para cada tipo e os parametros passados)
    @CrossOrigin(origins = "*")//perimite receber pos de requsisiçoes locais
    @PostMapping(path = "salvaProntuario",consumes = MediaType.APPLICATION_JSON_VALUE )
    public void salvaProntuario(@RequestBody final NovoProntuario novoProntuario){
        novoProntuarioServico.salvaProntuario(novoProntuario);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "pegarProntuario")
    public List<NovoProntuario> pegaTodosOsProntuarios(){
        return novoProntuarioServico.pegaTodosOsProntuarios();
    }
}
