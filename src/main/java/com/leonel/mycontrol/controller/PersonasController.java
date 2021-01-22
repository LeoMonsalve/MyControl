package com.leonel.mycontrol.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.leonel.mycontrol.models.Personas;
import com.leonel.mycontrol.services.PersonasService;

@Controller
@RequestMapping("/personas")
public class PersonasController {
	
	private final PersonasService personasService;
	
	public PersonasController(PersonasService personasService) {
		this.personasService= personasService;
	}
	@RequestMapping("/all")
	public String mostrar(Model model) {
		List<Personas> personas = personasService.allPersonas();
		model.addAttribute("personas", personas);
		return "/personas/all.jsp";
	}
	@RequestMapping("/nueva")
	public String nuevaPersona(@ModelAttribute("persona") Personas personas) {
		return "/personas/nueva.jsp";
	}
	
	@RequestMapping(value = "/nueva", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("personas") Personas personas, BindingResult result) {
		if (result.hasErrors()) {
			return "/personas/nueva.jsp";
		} else {
			personasService.createPersonas(personas);
			return "redirect:/personas/all";
		}
	}
	@RequestMapping("/mostrar/{id}")
	public String mostrar(@PathVariable("id") Long id, Model model) {
		Personas personas = personasService.findPersonas(id);
		model.addAttribute("personas", personas);
		return "personas/mostrar.jsp";
	}
	
	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("personas") Personas personas, BindingResult result) {
		if (result.hasErrors()) {
			return "/personas/mostrar/{id}";
		} else {
			personasService.updatePersonas(personas);
			return "redirect:/personas/all";
		}
	}
	@RequestMapping(value = "/mostrar/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		personasService.deletePersonas(id);
        return "redirect:/personas";
    }
}