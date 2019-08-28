package com.peldaspring.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Blogger {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	private String nev;
	private int kor;
	@OneToMany(mappedBy = "blogger")
	private List<Cikk> cikkek;
	
	private Blogger() {}
	
	public Blogger(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public List<Cikk> getCikkek() {
		return cikkek;
	}

	public void setCikkek(List<Cikk> cikkek) {
		this.cikkek = cikkek;
	}

	

	
	
}
