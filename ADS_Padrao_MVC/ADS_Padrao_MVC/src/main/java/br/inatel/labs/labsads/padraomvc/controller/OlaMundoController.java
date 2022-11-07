package br.inatel.labs.labsads.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OlaMundoController {

	@GetMapping("/ola")
	public String getOla(Model model) {
		
		model.addAttribute("user", "dju");
		
		return "ola-mundo";
	}
		
}
