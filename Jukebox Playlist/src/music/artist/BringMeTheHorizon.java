package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BringMeTheHorizon {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BringMeTheHorizon() {
    }
    
    public ArrayList<Song> getBMTHSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   	//Instantiate the album so we can populate it below
    	 Song track1 = new Song("Throne", "Bring Me The Horizon");            	 	//Create a song
         Song track2 = new Song("Can You Feel My Heart", "Bring Me The Horizon");   //Create another song
         this.albumTracks.add(track1);                                          	//Add the first song to song list for Bring Me the Horizon
         this.albumTracks.add(track2);                                          	//Add the second song to song list for Bring Me the Horizon 
         return albumTracks;                                                    	//Return the songs for Bring Me the Horizon in the form of an ArrayList
    }
}
