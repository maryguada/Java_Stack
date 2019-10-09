package com.codingdojo.onetomany.services;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.onetomany.models.Dojo;
import com.codingdojo.onetomany.models.Ninja;
import com.codingdojo.onetomany.repositories.DojoRepository;
import com.codingdojo.onetomany.repositories.NinjaRepository;

@Service
public class AppService {
	@Autowired 
	DojoRepository dojoRepo;

	@Autowired 
	NinjaRepository ninjaRepo; 
	
	public void createDojo(@Valid Dojo dojo) {
		// TODO Auto-generated method stub
		dojoRepo.save(dojo); 
	}

	public List<Dojo> getAllDojos() {
		// TODO Auto-generated method stub
		return dojoRepo.findAll();
	}

	public void createNinja(@Valid Ninja ninja) {
		// TODO Auto-generated method stub
		ninjaRepo.save(ninja); 
	} 

	public ArrayList<Ninja> all(){ 
		return (ArrayList<Ninja>) ninjaRepo.findAll(); 
	}
}
