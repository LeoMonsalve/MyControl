package com.leonel.mycontrol.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leonel.mycontrol.models.Personas;
import com.leonel.mycontrol.services.PersonasService;

@Controller
@RequestMapping("/buscar")
public class BuscarController {
	@PostMapping("/personas")
	public String buscar(Model model, @RequestParam(value="campoBuscar")String campoBuscar) {
		 List<Personas> personas = personasService.findByName(campoBuscar);
		 model.addAttribute("personas", personas);
		 return "buscar.jsp";
	}

	private final PersonasService personasService;
	
	public BuscarController(PersonasService personasService) {
		this.personasService= personasService;
	}
}
