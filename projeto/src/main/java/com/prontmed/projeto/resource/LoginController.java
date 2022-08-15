package com.prontmed.projeto.resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prontmed.projeto.repositorios.AdminRepositorio;


@RestController
@RequestMapping("/login")
public class LoginController {

        
        public String index(){
            return "index";
        }
        
      
       }




