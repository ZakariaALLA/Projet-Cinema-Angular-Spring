package com.cinema.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestAdmin {

	@GetMapping(path="/dashboard")
	public String dashbord() {
		return "dashboard";
	}
}
