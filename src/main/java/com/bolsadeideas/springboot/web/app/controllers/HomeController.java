package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// para redirigir a una ruta

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		//si pongo https://www.google.com despues de los dos puntos me lleva a google cuando entro en localhost:8080
		return "forward:/app/index"; //con redirect cambia la ruta de localhost:8080/app/index
		//forward no cambia la ruta sigue siendo localhost:8080 es mejor forward por temas de seguridad no da informacion
		// forward es para ruta de controladores no puede ser para rutas externas ej: si quiero redirigir a google
		// forward por detras esta haciendo un RequestDispacher.forward()
	}
}
