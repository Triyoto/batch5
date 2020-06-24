package com.example.smartschool.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartschool.model.BarangModel;
import com.example.smartschool.repository.BarangRepository;

@Service
@Transactional
public class BarangService {
	@Autowired
	private BarangRepository barangRepository;// membuatkan variabel baru dari class BarangRepository

	public void create(BarangModel barangModel) {
		this.barangRepository.save(barangModel);

	}

	public List<BarangModel> readData() {
		return this.barangRepository.findAll();
	}

	public void update(BarangModel barangModel) {
		this.barangRepository.save(barangModel);

	}

}
