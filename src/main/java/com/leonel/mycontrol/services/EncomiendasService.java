package com.leonel.mycontrol.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.leonel.mycontrol.models.Encomienda;

import com.leonel.mycontrol.repositories.EncomiendaRepository;

@Service
public class EncomiendasService {
	private final EncomiendaRepository encomiendaRepository;
	
	public EncomiendasService(EncomiendaRepository encomiendaRepository) {
		this.encomiendaRepository= encomiendaRepository;
	}
	public List<Encomienda>allEncomiendas(){
		return encomiendaRepository.findAll();
	}

}
