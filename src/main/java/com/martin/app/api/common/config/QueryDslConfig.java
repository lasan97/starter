package com.martin.app.api.common.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @since       2022.09.06
 * @author      martin
 * @description query dsl configuer
 **********************************************************************************************************************/
@Configuration
public class QueryDslConfig {

	@PersistenceContext
	private EntityManager entityManager;

	@Bean
	public JPAQueryFactory jPAQueryFactory() {
		return new JPAQueryFactory(entityManager);
	}
}
