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
import com.leonel.mycontrol.models.Departamentos;
import com.leonel.mycontrol.services.DepartamentosService;


@Controller
@RequestMapping("/departamentos")
public class DepartamentosController {
	private final DepartamentosService departamentosService;

	public DepartamentosController(DepartamentosService departamentosService) {
		this.departamentosService = departamentosService;
	}

	@RequestMapping("/all")
	public String mostrar(Model model) {
		List<Departamentos> departamentos=departamentosService.allDepartamentos();
		model.addAttribute("departamentos", departamentos);
		return "/departamentos/all.jsp";
	}

	@RequestMapping("/nuevo")
	public String nuevoDepartamento(@ModelAttribute("departamentos") Departamentos departamentos) {
		return "/departamentos/all.jsp";
	}

	@RequestMapping(value = "/departamentos", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("departamentos") Departamentos departamentos, BindingResult result) {
		if (result.hasErrors()) {
			return "/departamentos/nueva.jsp";
		} else {
			departamentosService.createDepartamentos(departamentos);
			return "redirect:/departamentos/all";
		}
	}

	@RequestMapping("/mostrar/{id}")
	public String mostrar(@PathVariable("id") Long id, Model model) {
		Departamentos departamentos = departamentosService.findDepartamentos(id);
		model.addAttribute("departamentos", departamentos);
		return "departamentos/mostrar.jsp";
	}

	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("departamentos") Departamentos departamentos, BindingResult result) {
		if (result.hasErrors()) {
			return "/departamentos/mostrar/{id}";
		} else {
			departamentosService.updateDepartamentos(departamentos);
			return "redirect:/departamentos/all";
		}
	}

	@RequestMapping(value = "/mostrar/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		departamentosService.deleteDepartamentos(id);
		return "redirect:/departamentos";
	}

}
