package sdust.easybuy.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sdust.easybuy.model.EasyBuyUser;

@Controller
@RequestMapping(value="user")
public class UserController {

//	@RequestMapping("/login.action")
//	public String login() {
//		return "redirect:/index.jsp";
////		if (user.getEuUserName().equals("admin")
////				&& user.getEuPassword().equals("admin")) {
////			return "loginSuccess";
////		}
////		System.out.println(user.getEuUserName());
////		return "loginError";
//	}
	
	@RequestMapping("/login.action")
	public ModelAndView show1(HttpServletRequest request, 
	           HttpServletResponse response) throws Exception { 
	       ModelAndView mav = new ModelAndView("/index"); 
	       mav.addObject("success", "test"); 
	       return mav; 
	   } 

}
