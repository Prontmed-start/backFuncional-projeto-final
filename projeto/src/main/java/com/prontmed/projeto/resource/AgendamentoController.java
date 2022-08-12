package com.prontmed.projeto.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgendamentoController {
	


	
	@RequestMapping("/agendamento")
	public String agendamento() {
		return "agendamento";
	}
	
	@GetMapping("/agendamentosucesso")
	public String adicionar( String agendamento) {
		
		System.out.println(agendamento);
	  
		return "agendamentosucesso";
	}
	
	
	

	
	
	
	
}

