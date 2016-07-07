package sdust.easybuy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/hello1")
	public String hello1(){
		System.out.println("Is in SuccessController!");
		return "success";
	}
	
	@RequestMapping("/hello2/{name}")
	public String hello2(@PathVariable("name") String name){
		System.out.println(name);
		return "success";
	}
	
}
