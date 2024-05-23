package com.example.springbhootcrudapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springbhootcrudapp.app.model.Product;

@SpringBootApplication
public class Springbhootcrudapp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbhootcrudapp2Application.class, args);
	   Product p  =new Product();
	   System.out.println(p);
	}

}
