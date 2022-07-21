package javaCollectionsQ1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		List<Song> Songss = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Enter the movie");
			
			String moviename = sc.next();
			
			System.out.println("Enter song");
			
			String songname = sc.next();
			
			Songss.add(new Song(moviename,songname));
			
		}
		
		PlayList pl = new PlayList();
		
		for (int i = 0; i < Songss.size(); i++) {
			
			pl.addSong(Songss.get(i));
			
		}
		
		for (int i = 0; i < pl.songs.size(); i++) {
			
			
			Song ss = pl.songs.get(i);
			ss.play();
		}
	}

}
