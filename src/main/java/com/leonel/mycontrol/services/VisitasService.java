package com.leonel.mycontrol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.leonel.mycontrol.models.Departamentos;
import com.leonel.mycontrol.models.Empresas;
import com.leonel.mycontrol.models.Usuarios;
import com.leonel.mycontrol.models.Visitas;
import com.leonel.mycontrol.repositories.VisitasRepository;

@Service
public class VisitasService {
	private final VisitasRepository visitasRepository;
	
	public VisitasService(VisitasRepository visitasRepository) {
		this.visitasRepository= visitasRepository;
	}
	public List<Visitas>allVisitas(){
		return visitasRepository.findAll();
	}
	public Visitas createVisitas(Visitas v) {
		return visitasRepository.save(v);
	}
	
	public Visitas findVisitas(Long id) {
		Optional<Visitas>optionalVisitas= visitasRepository.findById(id);
		if(optionalVisitas.isPresent()) {
			return optionalVisitas.get();
		}else {
			return null;
		}
	}
	public Visitas updateVisitas(Visitas v) {
		return visitasRepository.save(v);
	}
//	public Visitas updateVisitas(Long id, String hora, String fecha, Usuarios usuarios,
//			List<Departamentos> departamento){
//		Optional<Visitas>temp = visitasRepository.findById(id);
//		if(temp.isPresent()) {
//			Visitas visitas= temp.get();
//			visitas.setHora(hora);
//			visitas.setFecha(fecha);
//			visitas.setUsuarios(usuarios);
//			visitas.setDepartamento(departamento);
//			updateVisitas(visitas);
//			return visitas;
//		}
//		return null;
//	}
	public void deleteVisitas(Long id) {
		visitasRepository.deleteById(id);
	}
}
