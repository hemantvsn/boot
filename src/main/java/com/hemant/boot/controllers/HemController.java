package com.hemant.boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.boot.model.User;

@RestController
public class HemController {

	@RequestMapping("/")
	 User test() {
		return new User(100, "Hem Rocks");
	}

}
