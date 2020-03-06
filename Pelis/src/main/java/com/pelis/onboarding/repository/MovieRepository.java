package com.pelis.onboarding.repository;
import org.springframework.data.repository.CrudRepository;

import com.pelis.onboarding.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer>{

	
}
