package com.peldaspring.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity //(name="cikkek")
public class Cikk {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	@Column(length=200)
	private String cim;
	//@Column(name="kephelye")
	private String kepURL;
	@Column(columnDefinition="TEXT")
	private String tartalom;
	private Date kozzetetel;
	@ManyToOne
	private Blogger blogger;

	private Cikk() {}
		
		
	public Cikk(String cim, String kepURL, String tartalom, Date kozzetetel, Blogger blogger) {
		this.cim = cim;
		this.kepURL = kepURL;
		this.tartalom = tartalom;
		this.kozzetetel = kozzetetel;
		this.blogger = blogger;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getCim() {
		return cim;
	}
	public void setCim(String cim) {
		this.cim = cim;
	}
		
	public String getKepURL() {
		return kepURL;
	}
	public void setKepURL(String kepURL) {
		this.kepURL = kepURL;
	}
	public String getTartalom() {
		return tartalom;
	}
	public void setTartalom(String tartalom) {
		this.tartalom = tartalom;
	}
	public Date getKozzetetel() {
		return kozzetetel;
	}
	public void setKozzetetel(Date kozzetetel) {
		this.kozzetetel = kozzetetel;
	}


	public Blogger getBlogger() {
		return blogger;
	}
	@Override
	public String toString() {
		return "Cikk [id=" + id + ", cim=" + cim + ", kepURL=" + kepURL + ", tartalom=" + tartalom + ", kozzetetel="
				+ kozzetetel + ", blogger=" + blogger + "]";
	}


	public void setBlogger(Blogger blogger) {
		this.blogger = blogger;
	}
	
	
}