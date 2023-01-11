package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GeneratedPasswordConto {

	@Autowired
	GeneratedPasswordRepo gpr;
	
	public List<GeneratedPassword> getUserEndDate(String total){
		return gpr.getEndDate(total);
	}
	
	@GetMapping("/showapassword")
	public String viewAllProduct(Model model) {
	model.addAttribute("productList", gpr.findAll());
	return "allpassword";
	}
	
	@GetMapping("/newpasswordt")
	public String newProduct(Model model) {
		GeneratedPassword product = new GeneratedPassword();
		model.addAttribute("product",product);
		return "newpassword";
	}
	
	@PostMapping("/savepassword")
	public String saveProduct(@ModelAttribute GeneratedPassword pro) {
		gpr.save(pro);	
	return "redirect:/showapassword";
	}
	
	@GetMapping("/passtdelete/{id}")
	public String deleteProduct(@PathVariable (value = "id") int id) {
		gpr.deleteById(id);
	 	return "redirect:/showapassword";
	}
	
	@RequestMapping("/searchenddateresult")
	public String findByRevenue(@RequestParam String date,Model m) {
		  
		  m.addAttribute("st",getUserEndDate(date));
		  m.addAttribute("dat",date);
		 
		  return "searchenddate";

	}
	
	@RequestMapping("/searchenddate")
	public String searchByEndDate() {
		return "searchenddate";
	}
	
	@GetMapping("/passtdeletedate/{id}")
	public String deleteSub(@PathVariable (value = "id") int id) {
		gpr.deleteById(id);
	 	return "redirect:/searchenddate";
	}
}
