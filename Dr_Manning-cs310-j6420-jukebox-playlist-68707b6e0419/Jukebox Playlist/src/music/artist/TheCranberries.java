package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class TheCranberries {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheCranberries() {
    }
     
    public ArrayList<Song> getCranberriesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Zombie", "The Cranberries");                   //Create Cranberries song
         Song track2 = new Song("Dreams", "The Cranberries");                   //Create another Cranberries song
         this.albumTracks.add(track1);                                          //Add the first song to song list for The Cranberries
         this.albumTracks.add(track2);                                          //Add the second song to song list for The Cranberries 
         return albumTracks;                                                    //Return the songs for the Beatles in the form of an ArrayList
    }
}
