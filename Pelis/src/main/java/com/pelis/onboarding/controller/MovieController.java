package com.pelis.onboarding.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pelis.onboarding.dto.MovieDTO;
import com.pelis.onboarding.dto.MovieSimpleDTO;
import com.pelis.onboarding.entity.Movie;
import com.pelis.onboarding.mapper.Mapper;
import com.pelis.onboarding.repository.MovieRepository;

@RestController
@RequestMapping("/peliculas")
public class MovieController {
	
	@Autowired
	MovieRepository movies;
	
	/**
	 * CRUD PELICULAS
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable<MovieSimpleDTO> getMovies (){ 
		return Mapper.convertPeliculaToDto(movies.findAll(),movies);
	}

	@RequestMapping(value = "/peli", method = RequestMethod.GET)
	public Optional<MovieDTO> getMovie(Integer id) {
		return Mapper.convertPeliculaToDto(movies.findById(id),movies);
	}

	@RequestMapping(value = "/peli", method = RequestMethod.DELETE)
	public String deleteMovie(Integer id) {
		movies.deleteById(id);
		return "Movie DELETED";
	}
	
	@RequestMapping(value = "/peli", method = RequestMethod.PUT)
	public String modifyMovie(Movie peli) {
		movies.save(peli);
		return "Movie UPDATED";
	}
 
	@RequestMapping(value = "/peli", method = RequestMethod.POST) 
	public Movie addMovie(Movie peli) {
		return movies.save(peli);
	}
 
}
