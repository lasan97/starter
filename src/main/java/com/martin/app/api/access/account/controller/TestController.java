package com.martin.app.api.access.account.controller;

import com.martin.app.api.access.account.entity.Account;
import com.martin.app.api.access.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since       2022.09.10
 * @author      martin
 * @description test controller
 **********************************************************************************************************************/
@RestController
@RequiredArgsConstructor
public class TestController {

	private final AccountService accountService;

	@GetMapping("/add")
	public Account add() {
		return accountService.add(new Account("martin", "martin@niceday.io", "123"));
	}
}
