package com.leonel.mycontrol.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.leonel.mycontrol.models.Edificios;

public interface EdificiosRepository extends CrudRepository<Edificios, Long>{

	List<Edificios> findAll();
	
	Optional<Edificios> findById(Long id);

	void deleteById(Long id);
}
