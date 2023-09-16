package com.gianproco.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie{
	private int id;
	private int seasonNumber;
	private Serie serie;
	
	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public Chapter(String title, String genre, String creator, int duration, short year, int seasonNumber) {
		super(title, genre, creator, duration, year);
		this.seasonNumber = seasonNumber;
	}
	
	@Override
	public int getId() {
		return this.id;
	}
	
	public int getSeasonNumber() {
		return seasonNumber;
	}
	public void setSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}
	
	@Override
	public String toString() {
		return "\n :: CHAPTER ::" + 
				"\nTitle: " + getTitle() +
				"\nYear: " + getYear() +
				"\nCreator: " + getCreator() + 
				"\nDuration: " + getDuration();
	}
	
	public static ArrayList<Chapter> makeChaptersList(){
		ArrayList<Chapter> chapters = new ArrayList<Chapter>();
		
		for(int i = 1; i < 5; i++) {
			chapters.add(new Chapter("Chapter " + i, "Genre " + i, "Creator " + i, 60, (short)(2017 + i), i));
		}
		
		return chapters;
	}
	
	@Override
	public void watch() {
		super.watch();
		ArrayList<Chapter> chapters = getSerie().getChapters();
		int chaptersWatchedCounter = 0;
		
		for (Chapter chapter : chapters) {
			if(chapter.getIsWatched()) {
				chaptersWatchedCounter++;
			}
		}
		
		if(chaptersWatchedCounter == chapters.size()) {
			getSerie().setWatched(true);
		}
	}
		
}












