package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pp")
@CrossOrigin(origins = "*")
public class ProductParcesController {
	@Autowired
	ProductParcesRepo ppr;
@PostMapping("/fromsave")
public ProductParces createParses(@RequestBody ProductParces pp) {
return ppr.save(pp);
}
@GetMapping("/fromsave")
public List<ProductParces> getAllProductParces(){
	return ppr.findAll();	
}
}
