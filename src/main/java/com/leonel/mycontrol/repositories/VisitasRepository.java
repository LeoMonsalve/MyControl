package com.leonel.mycontrol.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.leonel.mycontrol.models.Visitas;

public interface VisitasRepository extends CrudRepository<Visitas, Long>{
	
	List<Visitas> findAll();
	
	Optional<Visitas> findById(Long id);

	void deleteById(Long id);
}
