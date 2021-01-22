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
import com.leonel.mycontrol.models.Empresas;
import com.leonel.mycontrol.services.EmpresasService;

@Controller
@RequestMapping("/empresas")
public class EmpresasController {
	private final EmpresasService empresasService;

	public EmpresasController(EmpresasService empresasService) {
		this.empresasService = empresasService;
	}

	@RequestMapping("/all")
	public String mostrar(Model model) {
		List<Empresas> empresas = empresasService.allEmpresas();
		model.addAttribute("empresas", empresas);
		return "/empresas/all.jsp";
	}

	@RequestMapping("/nueva")
	public String nuevaEmpresa(@ModelAttribute("empresas") Empresas empresas) {
		return "/empresas/all.jsp";
	}

	@RequestMapping(value = "/nueva", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("empresas") Empresas empresas, BindingResult result) {
		if (result.hasErrors()) {
			return "/empresas/nueva.jsp";
		} else {
			empresasService.createEmpresas(empresas);
			return "redirect:/edificios/all";
		}
	}

	@RequestMapping("/mostrar/{id}")
	public String mostrar(@PathVariable("id") Long id, Model model) {
		Empresas empresas = empresasService.findEmpresas(id);
		model.addAttribute("empresas", empresas);
		return "empresas/mostrar.jsp";
	}

	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("empresas") Empresas empresas, BindingResult result) {
		if (result.hasErrors()) {
			return "/empresas/mostrar/{id}";
		} else {
			empresasService.updateEmpresas(empresas);
			return "redirect:/empresas/all";
		}
	}

	@RequestMapping(value = "/mostrar/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		empresasService.deleteEmpresas(id);
		return "redirect:/empresas";
	}

}
