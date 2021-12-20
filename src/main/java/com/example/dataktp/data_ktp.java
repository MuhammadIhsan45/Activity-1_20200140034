package com.example.dataktp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class data_ktp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nomor_ktp" ,nullable=false)
	private Integer nomor_ktp;
	@Column(name = "nama" ,nullable=false)
	private String nama;
	@Column(name = "alamat" ,nullable=false)
	private String alamat;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNomor_ktp() {
		return nomor_ktp;
	}
	public void setNomor_ktp(Integer nomor_ktp) {
		this.nomor_ktp = nomor_ktp;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public data_ktp( Integer nomor_ktp, String nama, String alamat) {
		super();
		
		this.nomor_ktp = nomor_ktp;
		this.nama = nama;
		this.alamat = alamat;
	}
	
	public data_ktp() {
		
	}
	
	

}
