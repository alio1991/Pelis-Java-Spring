package com.example.demo.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Actor;

public interface ActorRepo extends CrudRepository<Actor, Integer>{
	
}

