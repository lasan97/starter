package com.martin.app.api.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @since       2022.09.10
 * @author      martin
 * @description auditing config
 **********************************************************************************************************************/
@Configuration
@EnableJpaAuditing
public class AuditingConfig {
}
