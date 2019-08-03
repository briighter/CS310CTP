package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class PorticoQuartet {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PorticoQuartet() {
    }
    
    public ArrayList<Song> getPorticoSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Isla", "Portico Quartet");             //Create a song
         Song track2 = new Song("Life Mask", "Portico Quartet");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Portico Quartet
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Portico Quartet 
         return albumTracks;                                                    //Return the songs for the Portico Quartet in the form of an ArrayList
    }
}