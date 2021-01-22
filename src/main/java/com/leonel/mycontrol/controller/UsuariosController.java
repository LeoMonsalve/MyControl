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
import com.leonel.mycontrol.models.Usuarios;
import com.leonel.mycontrol.services.UsuariosService;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	private final UsuariosService usuariosService;

	public UsuariosController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}

	@RequestMapping("/all")
	public String mostrar(Model model) {
		List<Usuarios> usuarios=usuariosService.allUsuarios();
		model.addAttribute("usuarios", usuarios);
		return "/usuarios/all.jsp";
	}

	@RequestMapping("/nuevo")
	public String nuevoUsuarios(@ModelAttribute("usuarios") Usuarios usuarios) {
		return "/usuarios/all.jsp";
	}

	@RequestMapping(value = "/usuarios", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("usuarios") Usuarios usuarios, BindingResult result) {
		if (result.hasErrors()) {
			return "/usuarios/nuevo.jsp";
		} else {
			usuariosService.createUsuarios(usuarios);
			return "redirect:/usuarios/all";
		}
	}

	@RequestMapping("/mostrar/{id}")
	public String mostrar(@PathVariable("id") Long id, Model model) {
		Usuarios usuarios = usuariosService.findUsuarios(id);
		model.addAttribute("usuarios", usuarios);
		return "usuarios/mostrar.jsp";
	}

	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("usuarios") Usuarios usuarios, BindingResult result) {
		if (result.hasErrors()) {
			return "/usuarios/mostrar/{id}";
		} else {
			 usuariosService.updateUsuarios(usuarios);
			return "redirect:/usuarios/all";
		}
	}

	@RequestMapping(value = "/mostrar/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		 usuariosService.deleteUsuarios(id);
		return "redirect:/usuarios";
	}
}
