package com.example.demo;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminConto {
@Autowired
AdminRepo ar;
@Autowired
CuponRepo cr;
public List<Admin> getAdmin(String a, String b){
	return ar.getAdminByName(a, b);
}
@RequestMapping("/admin")
public String admin() {
	return"admin";
}

@RequestMapping("/report")
public String report() {
	return"report";
}

@RequestMapping("/adminpass")
public String adminPass(@RequestParam String mail, @RequestParam String pass, Model m) {
	List<Admin> list = getAdmin(mail,pass);
	String ret = "";
	if(list.isEmpty()) {
		ret="admin";
	}
	else {
		ret="admindash";
	}
	return ret;
}

public int rando() {
	Random r = new Random();
	int rand = r.nextInt(10);
	return rand;
}

//@RequestMapping("/cupon")
//public String cupon(Model m) {
//	Cupon cp = new Cupon();
//	m.addAttribute("cp",cp);
//	return"cupon";
//	
//}

//@PostMapping("/savecupon")
//public String saveProduct(@ModelAttribute Cupon cp) {
//cr.save(cp);	
//return "redirect:/cupon";
//}



@RequestMapping("/cupongen")
public String cupongen(Model m) {
	Cupon cp = new Cupon();
	m.addAttribute("cp",cp);
	int b = rando();
	String a = "AoX"+b;
	m.addAttribute("a", a);
	return "cupon";
}
}
