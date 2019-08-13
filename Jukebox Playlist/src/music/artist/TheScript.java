package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class TheScript {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheScript() {
    }
    
    public ArrayList<Song> getScriptsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Added the album so we can populate it below
    	 Song track1 = new Song("Breakeven", "The Script");                     //Added a song
         this.albumTracks.add(track1);                                          //Add the first song to song list for The Script
         return albumTracks;                                                    //Return the songs for The Script in the form of an ArrayList
    }
}
