package com.prontmed.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgendamentoController {
	


	
	@RequestMapping("/agendamento")
	public String agendamento() {
		return "agendamento";
	}
	
	@PostMapping("/agendamentosucesso")
	public String adicionar( String agendamento) {
		
		System.out.println(agendamento);
	  
		return "agendamentosucesso";
	}
	
	
	

	
	
	
	
}
