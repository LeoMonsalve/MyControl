package com.leonel.mycontrol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.leonel.mycontrol.models.Departamentos;
import com.leonel.mycontrol.models.Edificios;
import com.leonel.mycontrol.models.Personas;
import com.leonel.mycontrol.models.Visitas;
import com.leonel.mycontrol.repositories.DepartamentosRepository;

@Service
public class DepartamentosService {
	private final DepartamentosRepository departamentosRepository;
	
	public DepartamentosService(DepartamentosRepository departamentosRepository) {
		this.departamentosRepository = departamentosRepository;
	}
	
	public List<Departamentos>allDepartamentos(){
		return departamentosRepository.findAll();
	}
	public Departamentos createDepartamentos(Departamentos d) {
		return departamentosRepository.save(d);
	}
	public Departamentos findDepartamentos(Long id) {
		Optional<Departamentos>optionalDepartamentos = departamentosRepository.findById(id);
		if(optionalDepartamentos.isPresent()) {
			return optionalDepartamentos.get();
		}else {
			return null;
		}
	}
	
	public Departamentos updateDepartamentos(Departamentos d) {
		return departamentosRepository.save(d);
	}
	
	public Departamentos updateDepartamentos(Long id, String numero, Personas propietario,List<Personas> personas,
			Edificios edificios, List<Visitas> visitas) {
		Optional<Departamentos> temp=departamentosRepository.findById(id);
		if(temp.isPresent()) {
			Departamentos depto =temp.get();
			depto.setNumero(numero);
			depto.setPropietario(propietario);
			depto.setPersonas(personas);
			depto.setEdificios(edificios);
			depto.setVisitas(visitas); 
			updateDepartamentos(depto);
			return depto;
		}
		return null;
	}
	public void deleteDepartamentos(Long id){
		departamentosRepository.deleteById(id);
	}
}
