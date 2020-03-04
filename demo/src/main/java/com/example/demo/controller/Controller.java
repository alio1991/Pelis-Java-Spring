package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class Controller {
	
	@GetMapping
	public ResponseEntity<String> get (){
		
		return ResponseEntity.ok("Hola Mundo");
		//listo....
	// Ni puta idea de todo lo que has hecho jajajaja
	// esta tarde miro a ver como va, muchas gracias
		// esto es un proyecto SpringBoot, a partir de aquí puedes mirar tutos de todos los estilos, PERFECT,  a ver que sale , la DDBB la levantais en un contenedor docker imagino no?
	//no, se levanta en memoria, un seg
	}

}
