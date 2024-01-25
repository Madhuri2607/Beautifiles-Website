package com.example.Beautiflies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("/index")
public String get1()
{
	return "index";
}
@GetMapping("/about")
public String get2()
{
	return "about";
}
@GetMapping("/client")
public String get3()
{
	return "client";
}
@GetMapping("/contact")
public String get4()
{
	return "contact";
}
@GetMapping("/products")
public String get5()
{
	return "products";
}



}
