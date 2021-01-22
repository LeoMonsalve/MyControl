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
import com.leonel.mycontrol.models.Edificios;
import com.leonel.mycontrol.services.EdificiosService;


@Controller
@RequestMapping("/edificios")
public class EdificiosController {
private final EdificiosService edificiosService;
	
	public EdificiosController(EdificiosService edificiosService) {
		this.edificiosService= edificiosService;
	}
	@RequestMapping("/all")
	public String mostrar(Model model) {
		List<Edificios> edificios = edificiosService.allEdificios();
		model.addAttribute("edificios", edificios);
		return "/edificios/all.jsp";
	}
	@RequestMapping("/nuevo")
	public String nuevoEdificio(@ModelAttribute("edificios") Edificios edificios) {
		return "/edificios/all.jsp";
	}
	
	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("edificios") Edificios edificios, BindingResult result) {
		if (result.hasErrors()) {
			return "/edificios/nuevo.jsp";
		} else {
			edificiosService.createEdificios(edificios);
			return "redirect:/edificios/all";
		}
	}
	@RequestMapping("/mostrar/{id}")
	public String mostrar(@PathVariable("id") Long id, Model model) {
		Edificios edificios= edificiosService.findEdificios(id);
		model.addAttribute("edificios", edificios);
		return "edificios/mostrar.jsp";
	}
	
	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("edificios") Edificios edificios, BindingResult result) {
		if (result.hasErrors()) {
			return "/edificios/mostrar/{id}";
		} else {
			edificiosService.updateEdificios(edificios);
			return "redirect:/edificios/all";
		}
	}
	@RequestMapping(value = "/mostrar/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		edificiosService.deleteEdificios(id);
        return "redirect:/edificios";
    }
}
