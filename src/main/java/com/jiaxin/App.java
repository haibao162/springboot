package com.jiaxin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiaxin.dao.RaspberryDao;
import com.jiaxin.entity.Raspberry;

@RestController
@EnableAutoConfiguration
public class App {
	
	@Autowired  
    private RaspberryDao raspberryDao;
	 @RequestMapping("/")
	  public String hello(Raspberry raspberry){
	    return "Hello world!";
	  }
 @RequestMapping("/getRaspberryList")
	  public  Object getRaspberryList(){
	 List<Raspberry> list=raspberryDao.findAll();
    
	    return list;
	  }
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}