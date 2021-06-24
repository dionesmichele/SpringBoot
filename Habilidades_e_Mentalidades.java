package com.helloword.hello.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/habilidades")

public class  Habilidades_e_Mentalidades{
	
	public String habilidades () {
	return "Habilidades e Mentalidades usadas nesse conteúdo:"
			+ "Orintação ao detalhe,orientação ao futuro e persistencia";

		}
}