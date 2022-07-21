package javaCollectionsQ1;

import java.util.Objects;

public class Song {
	
	private String movieName;
	
	private String songName;
	
	
	

	public Song() {
		super();
	}




	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}




	public String getMovieName() {
		return movieName;
	}




	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}




	public String getSongName() {
		return songName;
	}




	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	
	
	// play function
	
	
	public void play() {
		System.out.println("[ The Name oF movie is :"+" "+movieName+" "+"Song Name is :"+" "+songName+" ]");
	}
	
	//Override methods
	
	
	@Override
	public String toString() {
		return "Song [ Movie Name is :"+movieName+" "+"Song name is : "+songName+ "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songName, other.songName);
	}
	
	
	
	
	
	
	
	
	

}
