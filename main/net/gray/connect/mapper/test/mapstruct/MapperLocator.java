package net.gray.connect.mapper.test.mapstruct;

import net.gray.connect.mapper.test.mapstruct.mapper.IBlackMapper;
import net.gray.connect.mapper.test.mapstruct.mapper.IWhiteMapper;

import jakarta.inject.Inject;

public class MapperLocator {
	@Inject
	private IBlackMapper blackMapper;
	@Inject
	private IWhiteMapper whiteMapper;
	
	public IBlackMapper getBlackMapper() {
		return blackMapper;
	}
	
	public IWhiteMapper getWhiteMapper() {
		return whiteMapper;
	}
}
