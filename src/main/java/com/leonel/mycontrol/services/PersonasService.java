package com.leonel.mycontrol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.leonel.mycontrol.models.Personas;

import com.leonel.mycontrol.repositories.PersonasRepository;

@Service
public class PersonasService {
	private final PersonasRepository personasRepository;

	public PersonasService(PersonasRepository personasRepository) {
		this.personasRepository = personasRepository;
	}

	public List<Personas> allPersonas() {
		return personasRepository.findAll();
	}
	public List<Personas>findByName(String nombre){
		return personasRepository.findByNombreContaining(nombre);
	}

	public Personas createPersonas(Personas p) {
		return personasRepository.save(p);
	}

	public Personas findPersonas(Long id) {
		Optional<Personas> optionalPersonas = personasRepository.findById(id);
		if (optionalPersonas.isPresent()) {
			return optionalPersonas.get();
		} else {
			return null;
		}
	}

	public Personas updatePersonas(Personas p) {
		return personasRepository.save(p);
	}
//
//	public Personas updatePersonas(Long id, String nombre, String apellido, String rut, String fechaNacimiento,
//			 List<Departamentos> misPropiedades, Departamentos resideEn) {
//		Optional<Personas> temp = personasRepository.findById(id);
//		if (temp.isPresent()) {
//			Personas per = temp.get();
//			per.setNombre(nombre);
//			per.setApellido(apellido);
//			per.setRut(rut);
//			per.setFechaNacimiento(fechaNacimiento);
//			per.setMisPropiedades(misPropiedades);
//			per.setResideEn(resideEn);
//			updatePersonas(per);
//			return per;
//		}
//		return null;
//	}

	public void deletePersonas(Long id) {
		personasRepository.deleteById(id);
	}
}
