package com.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ngoDTO {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;	
	private String ngoName;
	private String ngoAddress;
	private String ngoType;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNgoName() {
		return ngoName;
	}
	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}
	public String getNgoAddress() {
		return ngoAddress;
	}
	public void setNgoAddress(String ngoAddress) {
		this.ngoAddress = ngoAddress;
	}
	public String getNgoType() {
		return ngoType;
	}
	public void setNgoType(String ngoType) {
		this.ngoType = ngoType;
	}
	
}
