package com.prontmed.projeto.resource;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
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
    public void salvaProntuario(@RequestBody final Admin admin){
        adminServico.salvaAdmin(admin);
    }

    @CrossOrigin(origins = "*")//perimite receber pos de requsisiçoes locais
    @PostMapping(path = "login",consumes = MediaType.APPLICATION_JSON_VALUE )
    public Admin loginUsuario(@RequestBody final Admin admin){
        final Admin adminLogado = adminServico.login(admin);//realiza o login
        return adminLogado;
    }

}
