package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ActorRepo;
import com.example.demo.dao.PeliculaRepo;
import com.example.demo.entity.Actor;
import com.example.demo.entity.Pelicula;

@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	PeliculaRepo peliculas;
	@Autowired
	ActorRepo actores;
	
	
	/**
	 * CRUD PELICULAS
	 * @return
	 */
	@RequestMapping(value = "peliculas/", method = RequestMethod.GET)
	public Iterable<Pelicula> getPelis (){
		return peliculas.findAll();
	}

	@RequestMapping(value = "peliculas/peli", method = RequestMethod.GET)
	public Optional<Pelicula> getPeli(Integer id) {
		return peliculas.findById(id);
	}
	
	
	@RequestMapping(value = "peliculas/peli", method = RequestMethod.DELETE)
	public String deletePeli(Integer id) {
		peliculas.deleteById(id);
		return "Movie DELETED";
	}
	
	@RequestMapping(value = "peliculas/peli")
	public String addPeli(Pelicula peli) {
		peliculas.save(peli);
		return "Movie CREATED/UPDATED";
	}

	
	/**
	 * CRUD ACTORES
	 * @return
	 */
	@RequestMapping(value = "actores/", method = RequestMethod.GET)
	public Iterable<Actor> getActores (){
		return actores.findAll();
	}

	@RequestMapping(value = "actores/actor", method = RequestMethod.GET)
	public Optional<Actor> getActor(Integer id) {
		return actores.findById(id);
	}
	
	
	@RequestMapping(value = "actores/actor", method = RequestMethod.DELETE)
	public String deleteActor(Integer id) {
		actores.deleteById(id);
		return "Character DELETED";
	}
	
	@RequestMapping(value = "actores/actor")
	public String addActor(Actor actor) {
		actores.save(actor);
		return "Character CREATED/UPDATED";
	}

}
