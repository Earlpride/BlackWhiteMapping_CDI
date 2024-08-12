package net.gray.connect.mapper.test.mapstruct.mapper;

import net.gray.connect.mapper.test.mapstruct.dto.BlackDto;
import net.gray.connect.mapper.test.mapstruct.entity.BlackEntity;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(uses = IWhiteMapper.class, componentModel = "jakarta-cdi", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface IBlackMapper {	
	BlackEntity toEntity(BlackDto dto);
	BlackDto toDto(BlackEntity entity);
}
