package com.martin.app.api.access.account.repository;

import com.martin.app.api.access.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;


/**
 * @since       2022.09.06
 * @author      martin
 * @description account repository
 **********************************************************************************************************************/
@Repository
public interface AccountRepository extends JpaRepository<Account, Long>, QuerydslPredicateExecutor<Account>, AccountRepositorySupport {

	Account findByName(String name);
}
