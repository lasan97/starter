package com.martin.app.api.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @since       2022.09.06
 * @author      martin
 * @description encoder config
 **********************************************************************************************************************/
@Configuration
public class EncoderConfig {

//	@Bean
	public BCryptPasswordEncoder passwordEncoder2(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
}
