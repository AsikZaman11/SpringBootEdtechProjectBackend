package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CuponConto {

	@Autowired
	private CuponRepo cr;
	
	@GetMapping("/showallcupon")
	public String viewAllcupon(Model model) {
	model.addAttribute("productList", cr.findAll());
	return "allcupon";
	}
	
	@GetMapping("/cupondelete/{id}")
	public String deleteProduct(@PathVariable (value = "id") int id) {
	 	 cr.deleteById(id);
	 	return "redirect:/showallcupon";
	}
	
	@RequestMapping("/cupon")
	public String cu(@ModelAttribute Cupon cp,Model m) {
	m.addAttribute("cp", cp);
		
		return"cupon";
	}
	
	@RequestMapping("/savecupon")
	public String savecp(@ModelAttribute Cupon cp) {
		cr.save(cp);
		return"redirect:/showallcupon";
	}
}
