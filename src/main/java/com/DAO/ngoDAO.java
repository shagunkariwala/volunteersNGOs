package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.DTO.ngoDTO;



public class ngoDAO {
	
	public List<ngoDTO> getNGOList(){
		List<ngoDTO> ngos = new ArrayList<ngoDTO>();
		
		ngoDTO ngo1 = new ngoDTO();
		ngoDTO ngo2 = new ngoDTO();
		
		ngo1.setId(new Integer(1));
		ngo1.setNgoName("life matters");
		ngo1.setNgoAddress("123 main st, new york, ny 24643");
		ngo1.setNgoType("social awareness");
		
		ngo2.setId(new Integer(2));
		ngo2.setNgoName("women in tech");
		ngo2.setNgoAddress("123 main st, new york, ny 24643");
		ngo2.setNgoType("women rights");
		
		ngos.add(ngo1);
		ngos.add(ngo2);
		return ngos;
	}
	
	public ngoDTO findNGOByName(String name){
		List<ngoDTO> ngos = new ArrayList<ngoDTO>();
		ngoDTO ngo = new ngoDTO();
		
		ngos = getNGOList();
		
		for (ngoDTO n : ngos) {
			if(n.getNgoName().equals(name)) {
				ngo = n;
			}
		}
		return ngo;
	}
 
}
