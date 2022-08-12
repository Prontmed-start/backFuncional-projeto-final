package com.prontmed.projeto.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {

    
    
        @GetMapping("/login")
        public String index(){
            return "index";
        }

        @PostMapping("/logar")
        public String logar(Model model, String login, String password, String remember){
            return "index";
        }
    }

