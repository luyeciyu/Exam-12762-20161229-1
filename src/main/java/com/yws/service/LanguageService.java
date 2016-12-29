package com.yws.service;

import com.yws.mapper.LanguageMapper;
import com.yws.pojo.Language;

public class LanguageService {
	
	private LanguageMapper languageMapper;
	
	public Language getById(Integer id){
		return languageMapper.getById(id);
	}

	public LanguageMapper getLanguageMapper() {
		return languageMapper;
	}

	public void setLanguageMapper(LanguageMapper languageMapper) {
		this.languageMapper = languageMapper;
	}
	
	
	
}
