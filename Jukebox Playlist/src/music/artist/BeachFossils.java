package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BeachFossils {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BeachFossils() {
    }
    
    public ArrayList<Song> getBeachSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Lemon Glow", "Beach Fossils");             //Create a song
         Song track2 = new Song("Closer Everywhere", "Beach Fossils");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beach Fossils
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Beach Fossils
         return albumTracks;                                                    //Return the songs for the Beach Fossils in the form of an ArrayList
    }
}