package com.peldaspring.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peldaspring.domain.Cikk;
import com.peldaspring.repository.CikkRepository;
import com.peldaspring.service.CikkService;

@Controller
public class HomeController {

	private CikkService cikkService;
	
	@Autowired
	public void setCikkService(CikkService cikkService) {
		this.cikkService = cikkService;
	}

	@RequestMapping("/")
	public String index(Model model, Locale locale) {
		model.addAttribute("pageTitle", "Példa Spring Boot + ThymeLeaf Blog Projekt");
		model.addAttribute("cikkek", cikkService.getCikkek());
		model.addAttribute("orszag",locale.getCountry());
		model.addAttribute("elsocikk", cikkService.getElsoCikk());
		return "index";
	}
	
		
	@RequestMapping("/user/{id}")
	public String SearchForUser(@PathVariable(value = "id") String id) throws Exception {
		if (id == null) 
			throw new Exception("Nincs ilyen ID-jű felhasználók!"); 
		
		return "user";
	}
	
	@RequestMapping("/cim/{cim}")
	public String searchForUser(@PathVariable(value = "cim") String cim, Model model) throws Exception {
		if (cim == null)
			throw new Exception("Nincs ilyen címmel cikkünk!");
		model.addAttribute("cikk", cikkService.getSpecificCikk(cim));
		return "cikk";
	}
	
//	@ExceptionHandler(Exception.class)
//	public String exceptionHandler(HttpServletRequest rA, Exception ex, Model model) {
//		model.addAttribute("errMessage", "Kivétel:" + ex.getMessage());
//		return "exceptionhandler";
//	}
	
//	private List<Cikk> getCikkek() {
//		 List<Cikk> cikkek = cikkRepo.findAll();
//		 
//		 Cikk cikk1 = new Cikk();
//		 cikk1.setCim("Első cikk");
//		 cikk1.setKepURL("images/fulls/01.jpg");
//		 cikk1.setTartalom("Ez az első cikk szövege");
//		 cikk1.setBlogger("Hofi");
//		 cikk1.setKozzetetel(new Date());
//		 
//		 Cikk cikk2 = new Cikk();
//		 cikk2.setCim("Második cikk");
//		 cikk2.setKepURL("images/fulls/02.jpg");
//		 cikk2.setTartalom("Ez pedig a második cikk szövege");
//		 cikk2.setBlogger("Valaki Más");
//		 cikk2.setKozzetetel(new Date());
//		 
//		 Cikk cikk3 = new Cikk();
//		 cikk3.setCim("Harmadik cikk");
//		 cikk3.setKepURL("images/fulls/03.jpg");
//		 cikk3.setTartalom("Itt a harmadik cikk szövege.");
//		 cikk3.setBlogger("Gipsz Jakab");
//		 cikk3.setKozzetetel(new Date());
//		 
//		 cikkek.add(cikk1);
//		 cikkek.add(cikk2);
//		 cikkek.add(cikk3);
//		 return cikkek;
//	}
	
	
}
