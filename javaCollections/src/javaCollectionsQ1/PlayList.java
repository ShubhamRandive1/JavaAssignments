package javaCollectionsQ1;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	
	List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		
		if(!songs.contains(song)) {
			
			songs.add(song);
			
			System.out.println("Song is added....");
		}else {
			
			System.out.println("Duplicate song....");
		}
		
	}

}
