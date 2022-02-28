package com.coinassets.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coinassets.models.User;

@SpringBootApplication
public class CoinassetsBackendApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CoinassetsBackendApplication.class, args);
		
		User yassine = new User(1 ,"Yassine@gmail.com", "admin");
		User adil = new User(2 ,"adil@gmail.com", "admin2");
		System.out.println(yassine);
		System.out.println(adil);
	 
	}

}
