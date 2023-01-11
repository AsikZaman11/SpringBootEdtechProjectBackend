package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductParcesConto {

	@Autowired
	ProductParcesRepo ppr;
	
	public int getReve(){
		return ppr.getRev();
	}
	public int getRevena(){
		return ppr.getRevenue();
	}
	public List<ProductParces> getUserByRevenuetotal(String total){
		return ppr.getUserByRevenue(total);
	}
	
	@GetMapping("/showparces")
	public String viewAllProduct(@ModelAttribute ProductParces pp,Model model) {
	model.addAttribute("productList", ppr.findAll());
	Integer max = getReve();
	ProductParces propar = ppr.findById(max).get();
	model.addAttribute("max", max);
	model.addAttribute("pp", propar);
	
	return "showparces";
	}
	
	@RequestMapping("searchbyrevenue")
	public String searchByRevenue() {
		return "revenue";
	}
	@RequestMapping("/searchrevenuersult")
	public String findByRevenue(@RequestParam String date,Model m) {
		  String tk = "TK";
		  m.addAttribute("tk",tk);
		  m.addAttribute("st",getUserByRevenuetotal(date));
		  m.addAttribute("dat",date);
		  int total = getRevena();
		  m.addAttribute("total", total);
		  return "revenue";

	}
	
	
	
//	@RequestMapping("/approve")
//	public String appr(@Param ("id") int id id,Model m) {
//		ProductParces pp = ppr.findById(id).get();
//		pp.setApprov("Approved");
//		ppr.save(pp);
//		m.addAttribute("plist", pp);
//		return"showparces";
//	}
//	
	@RequestMapping("/cupondelete/{id}")
	public String deleteProduct(@PathVariable (value = "id") int id) {
		ProductParces pp = ppr.findById(id).get();
		pp.setApprov("Approved");
	 	 ppr.save(pp);
	 	return "redirect:/showparces";
	}
}
