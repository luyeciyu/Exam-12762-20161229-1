package com.yws.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yws.mapper.FilmMapper;
import com.yws.pojo.Film;

@Service("filmService")
public class FilmService {

	@Autowired
	private FilmMapper filmMapper;
	
	public void insert(Film film){
		filmMapper.insert(film);
	}

	public FilmMapper getFilmMapper() {
		return filmMapper;
	}

	public void setFilmMapper(FilmMapper filmMapper) {
		this.filmMapper = filmMapper;
	}

	
	
	
}
