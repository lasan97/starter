package com.martin.app.api.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @since       2022.09.06
 * @author      martin
 * @description base
 **********************************************************************************************************************/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {

	@CreatedDate
	@Column(name="created_at", updatable=false)
	private LocalDateTime createdAt;

	@LastModifiedDate
	@Column(name="updated_at", insertable=false)
	private LocalDateTime updatedAt;

//	@CreatedBy
//	@JoinColumn(name="created_by", updatable=false)
//	@ManyToOne(fetch= FetchType.LAZY)
//	private Account creator;

//	@LastModifiedBy
//	@JoinColumn(name="updated_by", insertable=false)
//	@ManyToOne(fetch=FetchType.LAZY)
//	private Account updator;
}
