package com.crunchify.controller;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class CrunchifyHelloWorld {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(HttpServletRequest req, HttpServletResponse res) {
 
		/*String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		*/
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		if(password.equals("admin")) {
			String message = "Hello "+name;
			return new ModelAndView("welcome","message",message);
		}
		else {
			String message2="wrong credentials";
			return new ModelAndView("errorpage", "message", message2);
		}
	}
}