package com.pelis.onboarding.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import com.pelis.onboarding.entity.Movie;


@SpringBootTest
class MovieControllerTest {
	
	@InjectMocks
	private MovieController controller;


	@Test
	void contextLoads() {
	}
	
	@Test
	public void createMovie() {
		Movie testMovie = new Movie();
		testMovie.setId(1);
		testMovie.setTitle("Test");
		testMovie.setGenre("Drama");
		testMovie.setYear("2010");
		testMovie.setOscarAwards("1");
		System.out.println(controller.addMovie(testMovie));
		assertEquals(controller.addMovie(testMovie), HttpStatus.OK);
	}
	
//	@Test
//	public void updateMovie() {
//		assertEquals(controller.modifyMovie(new Movie()), HttpStatus.OK);
//	}
//	
//	@Test
//	public void getMovie() {
//		assertEquals(controller.getMovie(1), HttpStatus.OK);
//	}
//	
//	@Test
//	public void deleteMovie() {
//		assertEquals(controller.deleteMovie(1), HttpStatus.OK);
//	}



}