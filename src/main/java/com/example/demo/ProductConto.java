package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductConto {

	@Autowired
	ProductRepository pr;
	
	@GetMapping("/showallproduct")
	public String viewAllProduct(Model model) {
	model.addAttribute("productList", pr.findAll());
	return "allproduct";
	}
	
	@GetMapping("/newproduct")
	public String newProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
		return "newproduct";
	}
	
	@PostMapping("/saveproduct")
	public String saveProduct(@ModelAttribute Product pro) {
	pr.save(pro);	
	return "redirect:/showallproduct";
	}
	
	@GetMapping("/productupdate/{id}")
	public String showForUpdate(@PathVariable (value="id") int id, Model model) {
	Product product = pr.findById(id).get();
	model.addAttribute("product",product);
	return "updateproduct";
	}
	
	@GetMapping("/productdelete/{id}")
	public String deleteProduct(@PathVariable (value = "id") int id) {
	 	 pr.deleteById(id);
	 	return "redirect:/showallproduct";
	}
	
	
}
