package com.simform.dtoproject;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DtoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtoprojectApplication.class, args);
	}

//	@Bean
//	public ModelMapper modelMapper(){
//		return new ModelMapper();
//	}

}
