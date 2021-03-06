package com.jiaxin.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	 
	 @RequestMapping("/hello/{name}")  
	 @ResponseBody
	    public List home2( @PathVariable String name) {  
	        List list=new ArrayList();
	        list.add(name);
		 return list; 
	       
	    }
@RequestMapping("/getRaspberryList")
public Object getRaspberryList(){
	return raspberryservice.findAll();
	
	
}
}
