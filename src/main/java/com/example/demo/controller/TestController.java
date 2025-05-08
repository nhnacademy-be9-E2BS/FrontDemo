package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
	@GetMapping("/category")
	public String category() {
		return "test-cate";
	}

	@GetMapping("/checkout")
	public String checkout() {
		return "checkout";
	}

}
