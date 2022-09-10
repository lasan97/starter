package com.martin.app.api.access.account.repository;

import com.martin.app.api.access.account.entity.Account;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.martin.app.api.access.account.entity.QAccount.account;

/**
 * @since       2022.09.06
 * @author      martin
 * @description account repository impl
 **********************************************************************************************************************/
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepositorySupport{

	private final JPAQueryFactory queryFactory;
}
