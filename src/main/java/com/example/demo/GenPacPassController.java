package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/pacparses")
@CrossOrigin(origins = "*")
public class GenPacPassController {
	
	@Autowired
	GenPassPacRepo gppr;

	@GetMapping("/password/{email}")
	public GenPassPac gPass(@PathVariable("email") String email ){
		return gppr.findByEmail(email);
	}
}
