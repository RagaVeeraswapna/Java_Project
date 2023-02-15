package com.revature.model;

public class User {
	private String name;
	private String email;
	private String phoneno;
	private String address;
	private String dob;
	private int age;
	private String idproof;
	private String role;
	private String loginId;
	private String password;
	public User(String name, String email,String phoneno, String address, String dob, int age, String idproof,
			String role, String loginId, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.address = address;
		this.dob = dob;
		this.age = age;
		this.idproof = idproof;
		this.role = role;
		this.loginId = loginId;
		this.password = password;
	}
	public User() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phoneno=" + phoneno + ", address=" + address + ", dob="
				+ dob + ", age=" + age + ", idproof=" + idproof + ", role=" + role + ", loginId=" + loginId
				+ ", password=" + password + "]";
	}
	
	
	

}
