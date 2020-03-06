package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ActorDTO;
import com.example.demo.dto.ActorSimpleDTO;
import com.example.demo.dto.PeliculaDTO;
import com.example.demo.dto.PeliculaSimpleDTO;
import com.example.demo.entity.Actor;
import com.example.demo.entity.Pelicula;
import com.example.demo.repository.ActorRepo;
import com.example.demo.repository.PeliculaRepo;

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
	public Iterable<PeliculaSimpleDTO> getPelis (){ 
		return convertPeliculaToDto(peliculas.findAll());
	}

//	@RequestMapping(value = "peliculas/peli", method = RequestMethod.GET)
//	public Optional<Pelicula> getPeli(Integer id) {
//		return peliculas.findById(id);
//		
//	}
//	
	@RequestMapping(value = "peliculas/peli", method = RequestMethod.GET)
	public Optional<PeliculaDTO> getPeli(Integer id) {
		return convertPeliculaToDto(peliculas.findById(id));
		
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
	public Iterable<ActorSimpleDTO> getActores (){
		return convertActorToDto(actores.findAll());
	}

	@RequestMapping(value = "actores/actor", method = RequestMethod.GET)
	public Optional<ActorDTO> getActor(Integer id) {
		return convertActorToDto(actores.findById(id));
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
	
	
	private Iterable<PeliculaSimpleDTO> convertPeliculaToDto(Iterable<Pelicula> pelis) {
		ModelMapper modelMapper = new ModelMapper();
		ArrayList<PeliculaSimpleDTO> arrDTO = new ArrayList<PeliculaSimpleDTO>();
		for(Pelicula peli : pelis) {
			Pelicula entity = this.peliculas.save(peli);
			PeliculaSimpleDTO dto  = modelMapper.map(entity, PeliculaSimpleDTO.class);
			arrDTO.add(dto);
		}
		Iterable<PeliculaSimpleDTO> iterableDTO = arrDTO;
		return iterableDTO;
	} 
	
	private Optional<PeliculaDTO> convertPeliculaToDto(Optional<Pelicula> peli) {
		ModelMapper modelMapper = new ModelMapper();
		Pelicula entity = this.peliculas.save(peli.get());
		PeliculaDTO dto  = modelMapper.map(entity, PeliculaDTO.class);
		Optional<PeliculaDTO> optDTO = Optional.of(dto);
		return optDTO;
	} 
	
	private Iterable<ActorSimpleDTO> convertActorToDto(Iterable<Actor> pelis) {
		ModelMapper modelMapper = new ModelMapper();
		ArrayList<ActorSimpleDTO> arrDTO = new ArrayList<ActorSimpleDTO>();
		for(Actor peli : pelis) {
			Actor entity = this.actores.save(peli);
			ActorSimpleDTO dto  = modelMapper.map(entity, ActorSimpleDTO.class);
			arrDTO.add(dto);
		}
		Iterable<ActorSimpleDTO> iterableDTO = arrDTO;
		return iterableDTO;
	} 
	
	private Optional<ActorDTO> convertActorToDto(Optional<Actor> peli) {
		ModelMapper modelMapper = new ModelMapper();
		Actor entity = this.actores.save(peli.get());
		ActorDTO dto  = modelMapper.map(entity, ActorDTO.class);
		Optional<ActorDTO> optDTO = Optional.of(dto);
		return optDTO;
	} 

}
