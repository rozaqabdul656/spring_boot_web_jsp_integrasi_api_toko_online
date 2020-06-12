package com.main.model;

public class Admin {
	private Long id;
	private String ussername;
	private String nama;
	private String password;
	
	public Admin(Long id, String ussername, String nama, String password) {
		this.id = id;
		this.ussername = ussername;
		this.nama = nama;
		this.password = password;
	}
	
	public Admin () {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUssername() {
		return ussername;
	}
	public void setUssername(String ussername) {
		this.ussername = ussername;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
