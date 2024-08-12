package net.gray.connect.mapper.test.mapstruct;

import net.gray.connect.mapper.test.mapstruct.MapperLocator;
import net.gray.connect.mapper.test.mapstruct._MainTestUtils;

import net.gray.connect.mapper.test.mapstruct.dto.BlackDto;
import net.gray.connect.mapper.test.mapstruct.dto.WhiteDto;
import net.gray.connect.mapper.test.mapstruct.entity.BlackEntity;
import net.gray.connect.mapper.test.mapstruct.entity.WhiteEntity;
import net.gray.connect.mapper.test.mapstruct.mapper.IBlackMapper;
import net.gray.connect.mapper.test.mapstruct.mapper.IWhiteMapper;

public class BlackWhite {	
	public static void main(String[] args) {
    		//Creating DTOs - Reference chain: blackDto1 -> whiteDto1 -> null
		WhiteDto whiteDto = new WhiteDto();
		whiteDto.setGermanName("weiss_1");
		
		BlackDto blackDto = new BlackDto();
		blackDto.setGermanName("schwarz_1");
		blackDto.setWhite(whiteDto);

		//Printing DTOs
		System.out.println("###########################################");
		printObjectToConsole("blackDto", blackDto);
		System.out.println("###########################################");
		printObjectToConsole("whiteDto", whiteDto);
		try {
			//MapperLocator containing injected mappers to allow usage of them in static `main()`
			MapperLocator mapperLocator = new MapperLocator();
			IBlackMapper blackMapper = mapperLocator.getBlackMapper();
			IWhiteMapper whiteMapper = mapperLocator.getWhiteMapper();
			
			//Mapping DTOs to entities
			BlackEntity blackEntity = blackMapper.toEntity(blackDto);
			WhiteEntity whiteEntity = whiteMapper.toEntity(whiteDto);
			
			//Printing entities
			System.out.println("###########################################");
			printObjectToConsole("blackEntity", blackEntity);
			System.out.println("###########################################");
			printObjectToConsole("whiteEntity", whiteEntity);
			System.out.println("###########################################");
		} catch(NullPointerException npe) {
			throw new RuntimeException(npe);
		}
	}
}
