package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("az-eshop.com")
@CrossOrigin(origins = "*")
public class ProductController {
@Autowired
ProductRepository pr;

@GetMapping("/products")
public List<Product> getAllProducts(){
return pr.findAll();
}
}
