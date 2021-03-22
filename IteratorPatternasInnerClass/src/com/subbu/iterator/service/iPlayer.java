package com.subbu.iterator.service;

import java.util.List;

import com.subbu.iterator.model.Movie;

public interface iPlayer {
	public List<Movie> getMovies();

	public void addMovie(Movie movie);

	public void removeMovie(Movie movie);

	public iIterator createIterator(String iteratorType);
}