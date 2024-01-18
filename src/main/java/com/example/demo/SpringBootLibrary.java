package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class SpringBootLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	
	
	@GetMapping("/index")
	public String helloIndex(){
		return "index";
	}
}
