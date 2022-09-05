package com.martin.app.api.access.account.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

/**
 * @since       2022.09.06
 * @author      martin
 * @description account repository impl
 **********************************************************************************************************************/
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepositorySupport{

	private final JPAQueryFactory queryFactory;

}
