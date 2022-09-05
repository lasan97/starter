package com.martin.app.api.access.account.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.martin.app.api.common.entity.BaseEntity;

import javax.persistence.*;

/**
 * @since       2022.09.06
 * @author      martin
 * @description account
 **********************************************************************************************************************/
@Entity
@Table(name="tb_account")
@NoArgsConstructor
public class Account extends BaseEntity {

	@Id
	@Getter
	@Setter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Getter
	@Column(nullable=false)
	private String name;

	@Getter
	@Column(nullable=false)
	private String email;

	@Getter
	@Column(nullable=false)
	private String password;
}
