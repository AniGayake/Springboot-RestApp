package com.ani.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.ani.demo.model.Alien;

import antlr.collections.List;

public interface AlenRepo extends MongoRepository<Alien, Integer> {
	
}
