package com.gianproco.amazonviewer.model;

import java.util.Date;
import java.util.ArrayList;

public class Movie extends Film implements IWatchable{
	private int id;
	private int timeWatched;
		
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year); // -> sobreescribimos el método constructor
	}

	public void showData() {
		/*System.out.println("Title: " + title);
		System.out.println("Genre: " + genre);
		System.out.println("Year: " + year);*/
	}
	
	public int getId() {
		return id;
	}

	public int getTimeWatched() {
		return timeWatched;
	}


	public void setTimeWatched(int timeWatched) {
		this.timeWatched = timeWatched;
	}
	
	@Override
	public String toString() {
		return "::MOVIES::" +
				"Title: " + getTitle() +
				"\nGenre: " + getGenre() + 
				"\nCreator: " + getCreator() + 
				"\nDuration: " + getDuration() + 
				"\nYear: " + getYear();
	}

	@Override
	public Date startWatching(Date dateStart) {
		return dateStart;
	}

	@Override
	public void stopWatching(Date dateStart, Date dateStop) {
		if(dateStop.getTime() > dateStart.getTime()) {
			setTimeWatched((int)dateStop.getTime() - (int)dateStart.getTime());
		}else {
			setTimeWatched(0);
		}
		
	}
	
	public static ArrayList<Movie> makeMovies(){
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		for(int i = 1; i < 5; i++) {
			movies.add(new Movie("Movie " + i, "Genre " + i, "Creator " + i, 120, (short)(2015 + i)));
		}
		
		return movies;
	}
	

	
}
