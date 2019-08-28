package com.peldaspring.service;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peldaspring.domain.Blogger;
import com.peldaspring.domain.Cikk;
import com.peldaspring.repository.BloggerRepository;
import com.peldaspring.repository.CikkRepository;

@Service
public class CikkService {
	
	
	private CikkRepository cikkRepo;
	private BloggerRepository bloggerRepo;

	@Autowired
	public void setBloggerRepo(BloggerRepository bloggerRepo) {
		this.bloggerRepo = bloggerRepo;
	}

	@Autowired
	public void setCikkRepo(CikkRepository cikkRepo) {
		this.cikkRepo = cikkRepo;
	}

	public Cikk getElsoCikk() {
		return cikkRepo.findFirstByOrderByKozzetetelDesc();
	}
	
	public List<Cikk> getCikkek() {
		return cikkRepo.findAll();
	}

	public Cikk getSpecificCikk(String cim) {
		return cikkRepo.findByCim(cim);
	}
	
//	@PostConstruct
//	public void init()  {
//		Blogger blogger = new Blogger("Belső Hofi", 47);
//		bloggerRepo.save(blogger);
//		Cikk cikk = new Cikk("Belső cím", "images/fulls/01.jpg", "Belső tartalom", new Date(), blogger);
//		cikkRepo.save(cikk);
//	}
	
}
