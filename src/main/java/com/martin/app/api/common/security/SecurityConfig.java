package com.martin.app.api.common.security;

import com.martin.app.api.access.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @since       2022.09.06
 * @author      martin
 * @description security config
 **********************************************************************************************************************/
@EnableWebSecurity
@RequiredArgsConstructor
@Configuration
//@ConditionalOnDefaultWebSecurity
//@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class SecurityConfig {

	private final AccountService accountService;

	@Bean
	@Order(SecurityProperties.BASIC_AUTH_ORDER)
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		// resource 관리
		http.authorizeRequests()
				.antMatchers("/*").permitAll()
				.antMatchers("/api/**").authenticated()
				.antMatchers("/admin/**").hasAnyRole("ADMIN")
				.anyRequest().authenticated();

		// FormLogin 사용 설정
		http.formLogin().and().logout();

		// Http Basic 사용 설정
		http.httpBasic();

//		http.userDetailsService(accountService);
//				.antMatchers("/manager/**").access("hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")

//				.csrf().disable()
//				.headers().frameOptions().disable()

//				.and()
//				.logout()
//				.logoutSuccessUrl("/")
//				.and();
//				.oauth2Login()
//				.userInfoEndpoint()
//				.userService(accountService);

		return http.build();
	}
}
