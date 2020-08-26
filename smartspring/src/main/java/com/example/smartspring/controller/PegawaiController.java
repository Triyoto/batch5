package com.example.smartspring.controller;

import java.util.ArrayList;

import java.util.List;
import java.text.ParseException;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.smartspring.model.PegawaiModel;

import com.example.smartspring.service.PegawaiService;

@Controller
public class PegawaiController {
	
	@Autowired
	private PegawaiService pegawaiService;
	
	@RequestMapping ("/menu/Menu2Pegawai")
	public String menu2 (HttpServletRequest request, Model model) {
		String menu2 ="menu/Menu2Pegawai";
		return menu2;
	}
	
	
	@RequestMapping("/pegawai/create")
	public String pegawaiCreate(HttpServletRequest request, Model model) throws ParseException {
		int no = Integer.parseInt(request.getParameter("no")) ;
		String nik = request.getParameter("nik");
		String nama = request.getParameter("nama");
	
		
		//instance pasienModel
		PegawaiModel pegawaiModel = new PegawaiModel();
		
		//simpan ke masing2 kolom di database
		pegawaiModel.setNo(no);
		pegawaiModel.setNik(nik);
		pegawaiModel.setNama(nama);
		
		
		//save
		this.pegawaiService.create(pegawaiModel);
		
		//list
	
		this.ListPegawai(model);
		
		String html = "/pegawai/listPegawai";
		return html;
	}
	
	
	public void ListPegawai (Model model) {
		List<PegawaiModel> pegawaiModelList = new ArrayList<PegawaiModel>();
		pegawaiModelList = pegawaiService.readData();
		model.addAttribute("pegawaiModelList", pegawaiModelList);
	}
}
