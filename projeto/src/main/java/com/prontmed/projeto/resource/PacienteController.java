package com.prontmed.projeto.resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {

    @GetMapping("/novopaciente")
    public String cadastro(){
        return "novopaciente";
    }

}
