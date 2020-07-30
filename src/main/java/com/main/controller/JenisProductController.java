package com.main.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.main.daoImp.JenisProductImp;
import com.main.daoImp.ProductImp;
import com.main.model.JenisProduct;
import com.main.model.Product;

@Controller
public class JenisProductController {

	
	@Autowired
	JenisProductImp JpImp;
	
	@RequestMapping("/admin/jenis_product")
	 public ModelAndView index(ModelAndView mav, HttpServletRequest request, HttpServletResponse resp,RedirectAttributes ra){
	   mav.addObject("DataProduct", JpImp.getAllProduct());
       mav.setViewName("jenis_product");
       return mav;
   }
	@RequestMapping("/admin/add_jenis_product")
	 public ModelAndView add(ModelAndView mav, HttpServletRequest request, HttpServletResponse resp,RedirectAttributes ra){
	  mav.setViewName("add_jenis_product");
      return mav;
  }
	@RequestMapping("/admin/add_aksi_jenis_product")
	public String add_aksi(JenisProduct JenisProductModel, HttpServletRequest request, HttpServletResponse resp,RedirectAttributes ra){
		JenisProduct jp=new JenisProduct();
		JpImp.insertProduct(JenisProductModel);
		return "redirect:/admin/jenis_product";
	}
	

	@RequestMapping("/admin/edit_jenis_product/{id}")
	public ModelAndView edit(JenisProduct JenisProductModel,ModelAndView mav, HttpServletRequest request,@PathVariable(value="id")long id){
		   mav.addObject("data_Jenis_product", JpImp.getDetailAllProduct(id));
	       mav.setViewName("edit_jenis_product");
	       return mav;
	
	}
	@PostMapping("/admin/edit_aksi_jenis_product/{id}")
	public String update(JenisProduct JenisProductModel,ModelAndView mav, HttpServletRequest request,@PathVariable(value="id")long id){
		JenisProduct Jpm = new JenisProduct();
		Jpm.setJenis_product(id);
		Jpm.setNama_jenis_product(JenisProductModel.getNama_jenis_product());
		JpImp.updateProduct(Jpm);
		return "redirect:/admin/jenis_product";

	
	}
	@GetMapping("/admin/delete_jenis_product//{id}")
	public String delete(@PathVariable(value="id")long id){
		JpImp.deleteJenis(id);
		return "redirect:/admin/jenis_product";
	
	}
	
}
