package com.hibernate.mysql.springboot.controller;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomController implements ErrorController {

	private static final String PATH = "/error";
	
	@RequestMapping(value = PATH)
	public String error() {
		return "customError";
	}
	
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return PATH;
	}

	
	

}
