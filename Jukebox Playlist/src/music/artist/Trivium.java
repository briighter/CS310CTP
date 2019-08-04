package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Trivium {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Trivium() {
    }
    
    public ArrayList<Song> getTriviumSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("In Waves", "Trivium");             	//Create a song
         Song track2 = new Song("Strife", "Trivium");         	//Create another song
         Song track3 = new Song("Beyond Oblivion", "Trivium");					//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Trivium
         this.albumTracks.add(track2);                                          //Add the second song to song list for Trivium 
         this.albumTracks.add(track3);											//Add the third song to song list for Trivium
         return albumTracks;                                                    //Return the songs for Trivium in the form of an ArrayList
    }
}
