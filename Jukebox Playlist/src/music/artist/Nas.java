package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Nas {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Nas() {
    }
    
    public ArrayList<Song> getNasSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("One Mic", "Nas");                              //Creating song One Mic by Nas
         Song track2 = new Song("Ether", "Nas");                                //Creating song Ether by Nas
         this.albumTracks.add(track1);                                          //Add the first song to song list for Nas
         this.albumTracks.add(track2);                                          //Add the second song to song list for Nas 
         return albumTracks;                                                    //Return the songs for the Nas in the form of an ArrayList
    }
}