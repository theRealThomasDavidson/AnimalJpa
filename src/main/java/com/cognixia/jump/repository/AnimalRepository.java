package com.cognixia.jump.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cognixia.jump.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer>{
	public List<Animal> findByFamily(String family);
}
