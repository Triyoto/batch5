package com.example.smartspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.smartspring.model.PegawaiModel;
import com.example.smartspring.repository.PegawaiRepository;

@Service
@Transactional
public class PegawaiService {

	@Autowired 
	private PegawaiRepository pegawaiRepository; 
	
	public void create(PegawaiModel pegawaiModel) {
		this.pegawaiRepository.save(pegawaiModel);
	}
	

	public List<PegawaiModel> readData(){
		return this.pegawaiRepository.findAll();
	}
	
	
	public void update(PegawaiModel pegawaiModel) {
		this.pegawaiRepository.save(pegawaiModel);
	}
	
	
}
