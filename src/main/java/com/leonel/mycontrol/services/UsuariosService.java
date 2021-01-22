package com.leonel.mycontrol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.leonel.mycontrol.models.Edificios;
import com.leonel.mycontrol.models.Personas;
import com.leonel.mycontrol.models.Usuarios;
import com.leonel.mycontrol.models.Visitas;
import com.leonel.mycontrol.repositories.UsuariosRepository;

@Service
public class UsuariosService {
	private final UsuariosRepository usuariosRepository;
	
	public UsuariosService(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}
	public List<Usuarios>allUsuarios(){
		return usuariosRepository.findAll();
	}
	public Usuarios createUsuarios(Usuarios u) {
		return usuariosRepository.save(u);
	}
	
	public Usuarios findUsuarios(Long id) {
		Optional<Usuarios>optionalUsuarios= usuariosRepository.findById(id);
		if(optionalUsuarios.isPresent()) {
			return optionalUsuarios.get();
		}else {
			return null;
		}
	}
	public Usuarios updateUsuarios(Usuarios u) {
		return usuariosRepository.save(u);
	}
//	public Usuarios updateUsuarios(Long id,String nombre, String password, String email, Personas personas, Edificios edificios,
//			List<Visitas> visitas){
//		Optional<Usuarios>temp = usuariosRepository.findById(id);
//		if(temp.isPresent()) {
//			Usuarios usu = temp.get();
//			usu.setNombre(nombre);
//			usu.setPassword(password);
//			usu.setEmail(email);
//			usu.setEdificios(edificios);
//			usu.setVisitas(visitas);
//			updateUsuarios(usu);
//			return usu;
//		}
//		return null;
//	}
	public void deleteUsuarios(Long id) {
		usuariosRepository.deleteById(id);
	}
}
