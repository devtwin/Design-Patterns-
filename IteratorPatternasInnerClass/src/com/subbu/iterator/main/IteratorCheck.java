package com.subbu.iterator.main;

import com.subbu.iterator.model.Movie;
import com.subbu.iterator.service.iIterator;
import com.subbu.iterator.service.impl.PlayerImpl;

public class IteratorCheck {
	public static void main(String args[]) {
		PlayerImpl player = new PlayerImpl();
		player.addMovie(new Movie("Father", "English"));
		player.addMovie(new Movie("Mummy", "English"));
		player.addMovie(new Movie("Vater", "German"));
		player.addMovie(new Movie("Godfather", "English"));
		player.addMovie(new Movie("Wilder Stier", "German"));

		iIterator englishIterator = player.createIterator("English");
		while (!englishIterator.isLastMovie()) {
			System.out.println("English Movie: " + englishIterator.nextMovie().getMovieName());
		}

		iIterator germanIterator = player.createIterator("German");
		while (!germanIterator.isLastMovie()) {
			System.out.println("German Movie: " + germanIterator.nextMovie().getMovieName());
		}
		
	}
}