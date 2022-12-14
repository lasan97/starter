package com.martin.app.api.access.account.controller;

import com.martin.app.api.access.account.entity.Account;
import com.martin.app.api.access.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since       2022.09.06
 * @author      martin
 * @description account controller
 **********************************************************************************************************************/
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
public class AccountController {

	private final AccountService accountService;

	@GetMapping("/add")
	public Account add() {
		return accountService.add(new Account("martin", "martin@niceday.io", "123"));
	}

	@GetMapping("/info")
	public String info() {
		return "info";
	}
}
