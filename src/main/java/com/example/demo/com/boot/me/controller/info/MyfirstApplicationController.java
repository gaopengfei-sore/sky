package com.example.demo.com.boot.me.controller.info;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyfirstApplicationController 	{

	@RequestMapping("/hello")
	@ResponseBody
	public String HelloWorld() {
		System.out.println("comme in...");
		return "hello world";
	}

}
