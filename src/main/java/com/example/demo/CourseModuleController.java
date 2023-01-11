package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CourseModuleController {

	@Autowired
	CourseModuleRepo cmr;
	
	@GetMapping("/showallmodule")
	public String viewAllModule(Model model) {
	model.addAttribute("productList", cmr.findAll());
	return "allmodule";
	}
	
	@GetMapping("/newmodule")
	public String newProduct(Model model) {
		CourseModule product = new CourseModule();
		model.addAttribute("product",product);
		return "newmodule";
	}
	
	@PostMapping("/savemodule")
	public String saveModule(@ModelAttribute CourseModule pro) {
	cmr.save(pro);	
	return "redirect:/showallmodule";
	}
	
	@GetMapping("/moduleupdate/{id}")
	public String showForUpdate(@PathVariable (value="id") int id, Model model) {
	CourseModule product = cmr.findById(id).get();
	model.addAttribute("product",product);
	return "updtemodule";
	}
	
	@GetMapping("/moduledelete/{id}")
	public String deleteModule(@PathVariable (value = "id") int id) {
	 	 cmr.deleteById(id);
	 	return "redirect:/showallmodule";
	}
}
