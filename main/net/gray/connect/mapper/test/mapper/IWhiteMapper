package net.gray.connect.mapper.test.mapstruct.mapper;

import net.gray.connect.mapper.test.mapstruct.dto.WhiteDto;
import net.gray.connect.mapper.test.mapstruct.entity.WhiteEntity;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(uses = IBlackMapper.class, componentModel = "jakarta-cdi", injectionStrategy = InjectionStrategy.SETTER)
public interface IWhiteMapper {
	WhiteEntity toEntity(WhiteDto dto);
	WhiteDto toDto(WhiteEntity entity);
}
