package com.example.smartspring.model;


import javax.persistence.Column;
//model buat getter and setter
//untuk membuat table database di dalam projectnya
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//entyty pake yg javax.persistance
@Entity
//table untuk namain nama tabel
@Table (name="T_PEGAWAI")
public class PegawaiModel {
	//variable method
	
	
	@Id
	@Column (name="NO")
	private int no;
	
	@Column(name="NIK")
	private String nik;
	
	@Column (name="NAMA")
	private String nama;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	
	
	
}
