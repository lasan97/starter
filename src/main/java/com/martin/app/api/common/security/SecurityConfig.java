package com.martin.app.api.common.security;

import com.martin.app.api.access.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
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
@Configuration(proxyBeanMethods = false)
@ConditionalOnDefaultWebSecurity
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class SecurityConfig {

	private final AccountService accountService;

	@Bean
	@Order(SecurityProperties.BASIC_AUTH_ORDER)
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
				.antMatcher("/**")
				.authorizeRequests()
				.antMatchers("/user/**").authenticated()
				.antMatchers("/manager/**").access("hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
				.antMatchers("/admin/**").hasRole("ROLE_ADMIN")
				.anyRequest().permitAll();
//				.csrf().disable()
//				.headers().frameOptions().disable()
//				.and()
//				.authorizeRequests()
//				.antMatchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**").permitAll()
//				.antMatchers("/api/**").hasRole("Role_USER")
//				.anyRequest().authenticated()
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
