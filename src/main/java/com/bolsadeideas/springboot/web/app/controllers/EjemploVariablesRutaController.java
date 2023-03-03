package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// @PathVariable es mucho mas amigable para los buscadores, usuario una forma mas limpia de escribir la url y enviar parametros
@Controller

@RequestMapping("/variables")
public class EjemploVariablesRutaController {
	
	@GetMapping("/") 
	public String index(Model model) {
		model.addAttribute("titulo", "Enviar parametros de la ruta (@PathVariable)");
		return "variables/index";
	}
	
	@GetMapping("/string/{texto}")
	public String variable(@PathVariable String texto, Model model) {
		model.addAttribute("titulo", "Recibir parametros de la ruta (@PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " + texto);
		return "variables/ver";
	}
	
	
	// ruta con dos parametros de la ruta
	@GetMapping("/string/{texto}/{numero}")
	public String variable(@PathVariable String texto, @PathVariable Integer numero, Model model) {
		model.addAttribute("titulo", "Recibir parametros de la ruta (@PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " + texto
				+ " y el numero enviado en el path es: " + numero);
		return "variables/ver";
	}

}
