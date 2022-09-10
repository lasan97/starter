package com.martin.app.api.access.account.service;

import com.martin.app.api.access.account.entity.Account;
import com.martin.app.api.access.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @since       2022.09.06
 * @author      martin
 * @description account service
 **********************************************************************************************************************/
@Service
@Transactional
@RequiredArgsConstructor
public class AccountService implements UserDetailsService{

	private final AccountRepository accountRepository;
	private final PasswordEncoder passwordEncoder;

	public Account add(Account account) {
		account.passwordEncode(passwordEncoder);
		return accountRepository.save(account);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountRepository.findByName(username);

		if(account == null) {
			throw new UsernameNotFoundException(username);
		}

		return User.builder()
				.username(account.getName())
				.password(account.getPassword())
				.roles("USER")
				.build();
	}
}
