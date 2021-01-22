package com.leonel.mycontrol.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.leonel.mycontrol.models.Encomienda;


public interface EncomiendaRepository extends CrudRepository<Encomienda, Long>{
	List<Encomienda> findAll();

	Optional<Encomienda>findByEmpresa(Long id);


	void deleteById(Long id);

}
