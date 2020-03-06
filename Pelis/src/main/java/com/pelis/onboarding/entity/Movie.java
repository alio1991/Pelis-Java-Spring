package com.pelis.onboarding.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "Pelicula")
@Table(name = "pelicula")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String title;
	private String genre;
	private String year;
	private String oscars;
	
	@ManyToMany(
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			})
	@JoinTable(
			name = "PELICULA_ACTOR",
			joinColumns = @JoinColumn(name = "idMovie"),
			inverseJoinColumns = @JoinColumn(name = "idCharacter")
	)
	private Set<Actor> actors;
	 
	
	public Integer getId() { 
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getOscarAwards() {
		return oscars;
	}
	public void setOscarAwards(String oscarAwards) {
		this.oscars = oscarAwards;
	}
	public Set<Actor> getCharacters() {
		return actors;
	}
	public void setCharacters(Set<Actor> characters) {
		this.actors = characters;
	}
	

}
