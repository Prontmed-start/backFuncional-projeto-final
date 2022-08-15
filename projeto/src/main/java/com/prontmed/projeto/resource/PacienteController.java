package com.prontmed.projeto.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prontmed.projeto.entidades.Paciente;
import com.prontmed.projeto.servicos.PacienteServico;

@Controller
@RequestMapping("/novoPaciente")
public class PacienteController {

    @Autowired
    private PacienteServico pacienteServico;
  
@CrossOrigin(origins = "*")//perimite receber pos de requsisiçoes locais
@PostMapping(path = "salvaPaciente",consumes = MediaType.APPLICATION_JSON_VALUE )
public void salvaPaciente(@RequestBody final Paciente paciente){
    pacienteServico.salvaPaciente(paciente);
}
}
