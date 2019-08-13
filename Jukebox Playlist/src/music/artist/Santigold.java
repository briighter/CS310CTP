package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Santigold {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Santigold() {
    }
    
    public ArrayList<Song> getSantigoldsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Added the album so we can populate it below
    	 Song track1 = new Song("L.E.S. Artistes", "Santigold");                 //Added a song
         Song track2 = new Song("Unstoppable", "Santigold");                    //Added another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Santigold
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Santigold
         return albumTracks;                                                    //Return the songs for the Santigold in the form of an ArrayList
    }
}
