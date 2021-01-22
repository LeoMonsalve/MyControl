package com.leonel.mycontrol.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.leonel.mycontrol.models.Empresas;
import com.leonel.mycontrol.repositories.EmpresasRepository;

@Service
public class EmpresasService {
	private final EmpresasRepository empresasRepository;
	
	public EmpresasService(EmpresasRepository empresasRepository) {
		this.empresasRepository= empresasRepository;
	}
	public List<Empresas>allEmpresas(){
		return empresasRepository.findAll();
		}
	public Empresas createEmpresas(Empresas e) {
		return empresasRepository.save(e);
	}
	public Empresas findEmpresas(Long id) {
		Optional<Empresas>optionalEmpresas = empresasRepository.findById(id);
		if(optionalEmpresas.isPresent()) {
			return optionalEmpresas.get();
		}else {
			return null;
		}
	}
	public Empresas updateEmpresas(Empresas e) {
		return empresasRepository.save(e);
	}
//	public Empresas updateEmpresas(Long id, String nombre, String rut, String direccion, String telefono, List<Visitas>visitas ){
//		Optional<Empresas>temp = empresasRepository.findById(id);
//		if(temp.isPresent()) {
//			Empresas emp = temp.get();
//			emp.setNombre(nombre);
//			emp.setRut(rut);
//			emp.setDireccion(direccion);
//			emp.setTelefono(telefono);
//			emp.setVisitas(visitas);
//			return emp;
//		}
//		return null;
//	}
	public void deleteEmpresas(Long id) {
		empresasRepository.deleteById(id);
	}
}
