package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Keith_Sweat {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Keith_Sweat() {
    }
    
    public ArrayList<Song> getKeithSweatsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Twisted", "Keith Sweat");                      //Create a song
         Song track2 = new Song("Nobody", "Keith Sweat");                       //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Keith Sweat
         this.albumTracks.add(track2);                                          //Add the second song to song list for Keith Sweat 
         return albumTracks;                                                    //Return the songs for the Keith Sweat in the form of an ArrayList
    }
}
