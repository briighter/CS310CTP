package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class TheUsed {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheUsed() {
    }
    
    public ArrayList<Song> getTheUsedSongs() {
    	
   	 albumTracks = new ArrayList<Song>();                                      //Instantiate the album so we can populate it below
   	    Song track1 = new Song("The Taste of Ink", "The Used");                //Create a song
        Song track2 = new Song("Buried Myself Alive", "The Used");             //Create another song
        Song track3 = new Song("Pretty Handsome Awkward", "The Used");
        this.albumTracks.add(track1);                                          //Add the first song to song list for the TheUsed
        this.albumTracks.add(track2);                                          //Add the second song to song list for the TheUsed
        this.albumTracks.add(track3);
        return albumTracks;                                                    //Return the songs for the TheUsed in the form of an ArrayList
   }
 
}
