package com.leonel.mycontrol.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.leonel.mycontrol.models.Departamentos;


public interface DepartamentosRepository extends CrudRepository<Departamentos, Long> {
	
	List<Departamentos> findAll();
	
	Optional<Departamentos> findById(Long id);

	void deleteById(Long id);
}
