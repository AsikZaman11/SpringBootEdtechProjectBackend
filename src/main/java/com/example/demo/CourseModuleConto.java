package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("allmodule")
@CrossOrigin(origins = "*")
public class CourseModuleConto {

	@Autowired
	CourseModuleRepo cmr;
	
	@GetMapping("/couse")
	public List<CourseModule> getAllModule(){
	return cmr.findAll();
	}
}
