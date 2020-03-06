package com.pelis.onboarding.repository;
import org.springframework.data.repository.CrudRepository;

import com.pelis.onboarding.entity.Actor;

public interface ActorRepository extends CrudRepository<Actor, Integer>{
	
}

