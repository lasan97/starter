package com.martin.app.api.access.account.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.martin.app.api.common.entity.BaseEntity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.time.LocalDateTime;

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

	public Account(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public void passwordEncode(PasswordEncoder encoder) {
		this.password = encoder.encode(this.password);
	}
}
