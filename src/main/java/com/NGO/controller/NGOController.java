package com.NGO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.DAO.ngoDAO;
import com.DTO.ngoDTO;


@Controller
public class NGOController {
	
	private ngoDAO ngoService = new ngoDAO();
	
	@RequestMapping("/hello")
	@ResponseBody
	  public String hello() {
	    return "Hello volunteers - from NGO!!!";
	  }
	
	@RequestMapping(value = "/ngos")
	@ResponseBody
	public List<ngoDTO> getNGOListByName() {
		List<ngoDTO> ngos = ngoService.getNGOList();
		return ngos;
	}
	
	@RequestMapping(value = "/ngos/find/name/{name}")
	@ResponseBody
	public ngoDTO getNGOByName(@PathVariable String name) {
		ngoDTO ngos = ngoService.findNGOByName(name);
		return ngos;
	}

}
