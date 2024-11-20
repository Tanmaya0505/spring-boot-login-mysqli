package com.example.spring_boot_login_mysqli.LoginRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_boot_login_mysqli.Logindomain.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	
	Login findByUsernameAndPassword(String username, String password);

}
