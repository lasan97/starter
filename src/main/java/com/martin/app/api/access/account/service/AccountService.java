package com.martin.app.api.access.account.service;

import com.martin.app.api.access.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
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
public class AccountService {

	private final AccountRepository accountRepository;

	public void test() {
		accountRepository.findfindfindfind();
	}
}
