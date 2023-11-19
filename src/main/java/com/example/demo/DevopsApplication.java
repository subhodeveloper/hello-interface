package com.example.demo;

import java.time.Month;
import java.time.Year;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DevopsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		String data = "Hello " + name +" , this is " + Year.now().getValue();
		return data;
	}

	@GetMapping("/hi")
	public String hi(@RequestParam(value = "name", defaultValue = "World") String name) {
		String data = "Hi " + name + " , this is a test message";
		return data;
	}

}