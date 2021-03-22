package com.subbu.iterator.service.impl;

import java.util.List;

import com.subbu.iterator.model.Movie;
import com.subbu.iterator.service.iIterator;

public class GermanIterator implements iIterator {
	List<Movie> movieList;
	private int position;

	public GermanIterator(List<Movie> movieList) {
		this.movieList = movieList;
	}

	@Override
	public Movie nextMovie() {
		Movie movie = null;
		for (; position < movieList.size(); position++) {
			if ("German".equals((movieList.get(position)).getMovieLanguage())) {
				movie = movieList.get(position);
				position++;
				break;
			}
		}
		return movie;
	}

	@Override
	public boolean isLastMovie() {
		for (int i = position; i < movieList.size(); i++) {
			if ("German".equals((movieList.get(i)).getMovieLanguage())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Movie currentMovie() {
		if (position < movieList.size()) {
			return movieList.get(position);
		}
		return null;
	}
}