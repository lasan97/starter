package com.martin.app.api.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @since       2022.09.06
 * @author      martin
 * @description encoder config
 **********************************************************************************************************************/
@Configuration
public class EncoderConfig {

	@Bean
	public BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
