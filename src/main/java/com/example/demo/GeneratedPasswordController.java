package com.example.demo;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/parses")
@CrossOrigin(origins = "*")
public class GeneratedPasswordController {

	@Autowired
   GeneratedPasswordRepo gpr;
	
	@GetMapping("/password/{email}")
	public GeneratedPassword gPass(@PathVariable("email") String email ){
		return gpr.findByEmail(email);
	}
	 
	
}
