package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String index() {
		return "hello";
	}
}