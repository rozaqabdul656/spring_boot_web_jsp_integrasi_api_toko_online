package com.main.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.main.daoImp.JenisProductImp;
import com.main.daoImp.ProductImp;

@Controller
public class UserController {
	
	@Autowired
	ProductImp PrImp;
	
	@Autowired
	JenisProductImp JpImp;
	
	@RequestMapping("/")
	 public ModelAndView index(ModelAndView mav, HttpServletRequest request, HttpServletResponse resp,RedirectAttributes ra){
		 mav.addObject("DataJenisProduct", JpImp.getAllProduct());
		 mav.addObject("DataProduct", PrImp.getAllProduct());
		 mav.setViewName("home_user");
        return mav;
    }
}
