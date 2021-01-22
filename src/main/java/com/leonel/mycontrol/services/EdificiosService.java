package com.leonel.mycontrol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.leonel.mycontrol.models.Edificios;
import com.leonel.mycontrol.repositories.EdificiosRepository;

@Service
public class EdificiosService {
	private final EdificiosRepository edificiosRepository;
	
	public EdificiosService(EdificiosRepository edificiosRepository) {
		this.edificiosRepository= edificiosRepository;
	}
	public List<Edificios>allEdificios(){
		return edificiosRepository.findAll();
	}
	public Edificios createEdificios(Edificios e) {
		return edificiosRepository.save(e);
	}
	
	public Edificios findEdificios(Long id) {
		Optional<Edificios>optionalEdificios = edificiosRepository.findById(id);
		if(optionalEdificios.isPresent()) {
			return optionalEdificios.get();
		}else {
			return null;
		}
	}
	public Edificios updateEdificios(Edificios e) {
		return edificiosRepository.save(e);
	}
//	public Edificios updateEdificos(Long id, String nombre, String direccion, String telefono, String rut,
//			List<Departamentos> departamentos, List<Usuarios> usuarios){
//		Optional<Edificios>temp = edificiosRepository.findById(id);
//		if(temp.isPresent()) {
//			Edificios edf = temp.get();
//			edf.setNombre(nombre);
//			edf.setDireccion(direccion);
//			edf.setTelefono(telefono);
//			edf.setRut(rut);
//			edf.setDepartamentos(departamentos);
//			edf.setUsuarios(usuarios);
//			updateEdificios(edf);
//			return edf;
//		}
//		return null;
//	}
	public void deleteEdificios(Long id) {
		edificiosRepository.deleteById(id);
	}
	
}
