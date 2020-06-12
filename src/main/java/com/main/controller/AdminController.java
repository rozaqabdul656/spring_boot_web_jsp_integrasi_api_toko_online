package com.main.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {

	// inject via application.properties
	@Value("${welcome.message_coba:test}")
	private String message = "Hello World";

	@RequestMapping("/admin/dashboard")
//	public String welcome(Map<String, Object> model) {
//		model.put("message", this.message);
	 public ModelAndView index(ModelAndView mav, HttpServletRequest request, HttpServletResponse resp,RedirectAttributes ra){
//        mav.addObject("profile",appContext.getEnvironment().getActiveProfiles()[0]);
        mav.setViewName("dashboard");
        return mav;
    }
}
