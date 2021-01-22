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


import com.leonel.mycontrol.models.Visitas;

import com.leonel.mycontrol.services.VisitasService;

@Controller
@RequestMapping("/visitas")
public class VisitasController {
	private final VisitasService visitasService;

	public VisitasController(VisitasService visitasService) {
		this.visitasService = visitasService;
	}

	@RequestMapping("/all")
	public String mostrar(Model model) {
		List<Visitas> visitas= visitasService.allVisitas();
		model.addAttribute("visitas", visitas);
		return "/visitas/all.jsp";
	}

	@RequestMapping("/nueva")
	public String nuevaVisita(@ModelAttribute("visitas") Visitas visitas) {
		return "/visitas/all.jsp";
	}

	@RequestMapping(value = "/nueva", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("visitas") Visitas visitas, BindingResult result) {
		if (result.hasErrors()) {
			return "/visitas/nueva.jsp";
		} else {
			visitasService.createVisitas(visitas);
			return "redirect:/visitas/all";
		}
	}

	@RequestMapping("/mostrar/{id}")
	public String mostrar(@PathVariable("id") Long id, Model model) {
		Visitas visitas= visitasService.findVisitas(id);
		model.addAttribute("visitas", visitas);
		return "visitas/mostrar.jsp";
	}

	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("visitas") Visitas visitas, BindingResult result) {
		if (result.hasErrors()) {
			return "/visitas/mostrar/{id}";
		} else {
			visitasService.updateVisitas(visitas);
			return "redirect:/visitas/all";
		}
	}

	@RequestMapping(value = "/mostrar/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		visitasService.deleteVisitas(id);
		return "redirect:/visitas";
	}

}
