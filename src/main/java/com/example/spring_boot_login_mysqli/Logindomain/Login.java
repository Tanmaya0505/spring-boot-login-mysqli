package com.example.spring_boot_login_mysqli.Logindomain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Login {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    
    public Login() {
		// TODO Auto-generated constructor stub
	}
    
public Login(Long id, String username, String password) {
        
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
    
    
}
