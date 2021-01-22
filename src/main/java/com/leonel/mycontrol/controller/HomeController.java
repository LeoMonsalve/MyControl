package com.leonel.mycontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "/home/home.jsp";
    }

    @RequestMapping("/registro")
    public String formulario(){
        return "/registro/registro.jsp";
    }

    @RequestMapping("/login")
    public String login(){
        return "/home/login.jsp";
    }
    @RequestMapping("/entrega")
    public String entrega() {
    	return "/registro/entrega.jsp";
    }
    @RequestMapping("/encomienda")
    public String encomienda() {
    	return "/personas/opcionPersona.jsp";
    }
}
