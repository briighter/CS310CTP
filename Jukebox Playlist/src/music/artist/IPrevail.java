package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class IPrevail {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public IPrevail() {
    }
    
    public ArrayList<Song> getIPrevailSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Paranoid", "I Prevail");             			//Create a song
         Song track2 = new Song("Breaking Down", "I prevail");         			//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for I Prevail
         this.albumTracks.add(track2);                                          //Add the second song to song list for I Prevail
         return albumTracks;                                                    //Return the songs for I Prevail in the form of an ArrayList
    }
}
