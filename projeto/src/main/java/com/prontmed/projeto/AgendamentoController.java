package com.prontmed.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgendamentoController {

	
	@RequestMapping("/agendamento")
	public String agendamento() {
		return "agendamento";
	}
	
	
	
	

	
	
	
	
}
