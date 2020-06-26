package com.main.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.main.daoImp.JenisProductImp;
import com.main.daoImp.ProductImp;
import com.main.model.JenisProduct;
import com.main.model.Product;


@Controller
public class ProductController {
	
	@Autowired
	ProductImp PrImp;
	
	@Autowired
	JenisProductImp JpImp;
	
	
	
	@RequestMapping("/admin/product")
	 public ModelAndView index(ModelAndView mav, HttpServletRequest request, HttpServletResponse resp,RedirectAttributes ra){
       
		mav.addObject("DataProduct", PrImp.getAllProduct());
        mav.setViewName("product");
        return mav;
    }
	
	@RequestMapping("/admin/edit_product/{id}")
	 public ModelAndView edit(ModelAndView mav, HttpServletRequest request, HttpServletResponse resp,RedirectAttributes ra,@PathVariable(value="id") int id){
		mav.addObject("DataJenisProduct", JpImp.getAllProduct());
		mav.addObject("DataProduct", PrImp.getDetailAllProduct(id));
       mav.setViewName("edit_product");
       return mav;
   }
	
	@RequestMapping("/admin/add_product")
	 public ModelAndView add(ModelAndView mav, HttpServletRequest request, HttpServletResponse resp,RedirectAttributes ra){
		mav.addObject("DataJenisProduct", JpImp.getAllProduct());
	  mav.setViewName("add_product");
	  
      return mav;
  }
	@RequestMapping("/admin/add_aksi_product")
	 public String add_aksi( Product ProductModel,HttpServletRequest request,@RequestParam("file") MultipartFile file) throws IOException{
		String filename=PrImp.storeFile(file);
		
//		ProductModel.setGambar_product(filename);
//		JenisProduct Jp=new JenisProduct();
//		Jp.setProducts(ProductModel.getJenisProduct());
//		ProductModel.setJenisProduct(Jp);
//		PrImp.insertProduct(ProductModel);
//		
		Product PrUpdated=new Product();
		PrUpdated.setNama_product(ProductModel.getNama_product());
		PrUpdated.setBerat(ProductModel.getBerat());
		PrUpdated.setHarga(ProductModel.getHarga());
		JenisProduct Jp=new JenisProduct();
		Jp.setProducts(ProductModel.getJenisProduct());
		PrUpdated.setJenisProduct(Jp);
		ProductModel.setGambar_product(filename);
		PrUpdated.setGambar_product(ProductModel.getGambar_product());
	
		
//		String filename=PrImp.storeFile(file);
		PrImp.insertProduct(PrUpdated);
		
		
		if(file != null ){
			file.transferTo(new File(request.getSession().getServletContext().getRealPath("ui")+"/img/"+file.getOriginalFilename()));
		}
		
		return "redirect:/admin/product";
//	 return ProductModel.getNama_product();
 }
	
	
	@RequestMapping(value = "/admin/update_product/{id}")
	public String update(@PathVariable(value="id") Long id, Product ProductModel,HttpServletRequest request,@RequestParam("file") MultipartFile file) throws IOException{
		
	
		Product PrUpdated = PrImp.getFindOne(id);
		PrUpdated.setId_product(id);
		PrUpdated.setNama_product(ProductModel.getNama_product());
		PrUpdated.setBerat(ProductModel.getBerat());
		PrUpdated.setHarga(ProductModel.getHarga());
		JenisProduct Jp=new JenisProduct();
		Jp.setProducts(ProductModel.getJenisProduct());
		PrUpdated.setJenisProduct(Jp);
		String filename=PrImp.storeFile(file);
		
		if(filename!=null) {
			ProductModel.setGambar_product(filename);
			
		}
		PrUpdated.setGambar_product(ProductModel.getGambar_product());
		
		if(filename != null ){
			file.transferTo(new File(request.getSession().getServletContext().getRealPath("ui")+"/img/"+file.getOriginalFilename()));
		}
		
		Product ProductModelInp=PrImp.updateProduct(PrUpdated);
		
		return "redirect:/admin/product";
  }
	
	@RequestMapping(value = "/admin/delete_product/{id}")
	public String delete(@PathVariable(value="id") Long id,HttpServletRequest request){
		PrImp.delete(id);
		return "redirect:/admin/product";
  }
	
	
	
}
