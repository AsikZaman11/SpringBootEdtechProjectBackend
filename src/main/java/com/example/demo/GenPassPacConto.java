package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GenPassPacConto {

	@Autowired
	GenPassPacRepo gppr;
	
	@GetMapping("/showpacpass")
	public String viewAllPacPass(Model model) {
	model.addAttribute("productList", gppr.findAll());
	return "allpacpass";
	}
	
	@GetMapping("/newpacpass")
	public String newPacPass(Model model) {
		GenPassPac product = new GenPassPac();
		model.addAttribute("product",product);
		return "newpacpass";
	}
	
	@PostMapping("/savepacpass")
	public String savePacPass(@ModelAttribute GenPassPac pro) {
		gppr.save(pro);	
	return "redirect:/showpacpass";
	}
	
	@GetMapping("/pacpasstdelete/{id}")
	public String deletePacPass(@PathVariable (value = "id") int id) {
		gppr.deleteById(id);
	 	return "redirect:/showpacpass";
	}
}
