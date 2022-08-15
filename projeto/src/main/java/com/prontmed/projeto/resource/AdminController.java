package com.prontmed.projeto.resource;
    

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prontmed.projeto.entidades.Admin;
import com.prontmed.projeto.servicos.AdminServico;

@RestController
@RequestMapping("/cadastro")
public class AdminController {

        @Autowired
        private  AdminServico adminServico;   
      
    @CrossOrigin(origins = "*")//perimite receber pos de requsisiçoes locais
    @PostMapping(path = "salvaAdmin",consumes = MediaType.APPLICATION_JSON_VALUE )
    public void salvaAdmin(@RequestBody final Admin admin){
        adminServico.salvaAdmin(admin);
    }

}
