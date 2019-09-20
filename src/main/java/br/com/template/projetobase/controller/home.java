package br.com.template.projetobase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home {

	@GetMapping("/")
	public String paginaInicial() {
		return "index.html";
	}
}
