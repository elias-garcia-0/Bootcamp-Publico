package com.elias.productosycategorias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.elias.productosycategorias.services.MainService;

@Controller
public class MainController {
	
	private final MainService mainServ;
	public MainController(MainService mainS) {
		this.mainServ = mainS;
	}

	@GetMapping("/")
	public String root(Model modelo) {
		modelo.addAttribute("productos", mainServ.todosProductos() );
		modelo.addAttribute("categorias", mainServ.todosCategorias() );
		return "index.jsp";
	}
	
}