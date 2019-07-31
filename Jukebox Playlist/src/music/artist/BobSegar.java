package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BobSegar {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BobSegar() {
    }
    
    public ArrayList<Song> getBobSegarSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                    //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Night Moves", "Bob Segar");            		 //Create a song
         Song track2 = new Song("Against the Wind", "Bob Segar");        		 //Create another song
         this.albumTracks.add(track1);                                           //Add the first song to song list for Bob Segar
         this.albumTracks.add(track2);                                           //Add the second song to song list for Bob Segar
         return albumTracks;                                                     //Return the songs for Bob Segar in the form of an ArrayList
    }
}
