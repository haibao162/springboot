package com.jiaxin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiaxin.service.RaspberryService;
@RestController  
@EnableAutoConfiguration 
public class RaspberryController {
	@Autowired
	private RaspberryService raspberryservice;
	@Value("${port}") 
	 public int port;
	 @RequestMapping("/")  
	    public int home() {  
		 System.out.println(port);
	        return port; 
	       
	    }  
	      
	    @RequestMapping("/hello/{myName}")  
	    String index(@PathVariable String myName) {  
	        return "Hello "+myName+"!!!";  
	    }
@RequestMapping("/getRaspberryList")
public Object getRaspberryList(){
	return raspberryservice.findAll();
	
	
}
}
