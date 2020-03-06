package com.example.demo.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ActorDTO {

	private Integer id;
	private String name;
	private String surname;
	@JsonIgnoreProperties("characters")
	private Set<PeliculaSimpleDTO> peliculas;

	
	public Set<PeliculaSimpleDTO> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(Set<PeliculaSimpleDTO> peliculas) {
		this.peliculas = peliculas;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
