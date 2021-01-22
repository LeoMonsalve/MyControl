package com.leonel.mycontrol.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.leonel.mycontrol.models.Empresas;

public interface EmpresasRepository extends CrudRepository<Empresas, Long> {
	List<Empresas> findAll();
	
	Optional<Empresas> findById(Long id);

	void deleteById(Long id);
}
