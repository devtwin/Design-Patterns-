package com.subbu.iterator.model;

public class Movie {
	private String movieName;
	private String movieLanguage;

	public Movie(String movieName, String movieLanguage) {
		this.movieName = movieName;
		this.movieLanguage = movieLanguage;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
}