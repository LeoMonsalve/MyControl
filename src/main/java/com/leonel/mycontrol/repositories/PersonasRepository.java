package com.leonel.mycontrol.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.leonel.mycontrol.models.Personas;

public interface PersonasRepository extends CrudRepository<Personas, Long> {
	// Este método recupera todas las personas de la base de datos
		List<Personas> findAll();

		// Este método encuentra persona por su descripción
		List<Personas> findByNombreContaining(String search);
		
		Optional<Personas>findByRut(Long id);

		// Este método cuenta cuántas personas contiene cierta cadena con el  rut
		Long countByRutContaining(String search);

		// Este método borra una persona que empieza con un rut específico
		Long deleteByRutStartingWith(String search);

		Optional<Personas> findById(Long id);

		void deleteById(Long id);
}
