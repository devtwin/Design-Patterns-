package com.subbu.iterator.service;

import com.subbu.iterator.model.Movie;

public interface iIterator {
	public Movie nextMovie();

	public boolean isLastMovie();

	public Movie currentMovie();
}