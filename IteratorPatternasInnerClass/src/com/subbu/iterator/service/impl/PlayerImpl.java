package com.subbu.iterator.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.subbu.iterator.model.Movie;
import com.subbu.iterator.service.iIterator;
import com.subbu.iterator.service.iPlayer;

public class PlayerImpl implements iPlayer {
	List<Movie> movieList;

	public PlayerImpl() {
		movieList = new ArrayList<Movie>();
	}

	@Override
	public List<Movie> getMovies() {

		return movieList;
	}

	@Override
	public void addMovie(Movie movie) {
		movieList.add(movie);
	}

	@Override
	public void removeMovie(Movie movie) {
		movieList.remove(movie);
	}

	@Override
	public iIterator createIterator(String iteratorType) {
		if ("English".equals(iteratorType)) {
			return new EnglishIterator(movieList);
		} else {
			return new GermanIterator(movieList);
		}
	}
}