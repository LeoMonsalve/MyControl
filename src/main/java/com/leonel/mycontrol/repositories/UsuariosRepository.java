package com.leonel.mycontrol.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.leonel.mycontrol.models.Usuarios;

public interface UsuariosRepository extends CrudRepository<Usuarios, Long>{
	List<Usuarios> findAll();
	
	Optional<Usuarios> findById(Long id);
	
	void deleteById(Long id);
	
}
