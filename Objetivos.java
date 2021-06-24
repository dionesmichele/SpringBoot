package com.helloword.hello.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	
	@GetMapping
	public String objetivos() {
		
		return "- Objetivos da semana: Aprender O Spring Boot"
		+ " - Pesquisar mais sobre API"
		+ " - Revisar todo o conteudo e me interar"	
		+ " - Conhecer Maven,REST, Frameworks e MVC";
		
	}
}