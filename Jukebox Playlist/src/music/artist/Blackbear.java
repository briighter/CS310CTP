package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Blackbear {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Blackbear() {
    }
    
    // Improvement: Missing posessive artist got get call
    public ArrayList<Song> getBlackbearsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Indecision", "Blackbear");             		//Create a song
         Song track2 = new Song("1 Sided Love", "Blackbear");         			//Create another song
         Song track3 = new Song("hot girl bummer", "Blackbear");         		//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Blackbear
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Blackbear
         this.albumTracks.add(track3);                                          //Add the third song to song list for the Blackbear
         return albumTracks;                                                    //Return the songs for the Blackbear in the form of an ArrayList
    }
}
