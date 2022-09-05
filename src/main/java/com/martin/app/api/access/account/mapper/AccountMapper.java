package com.martin.app.api.access.account.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @since       2022.09.06
 * @author      martin
 * @description account mapper
 **********************************************************************************************************************/
@Mapper
public interface AccountMapper {

	AccountMapper mapper = Mappers.getMapper(AccountMapper.class);


}
