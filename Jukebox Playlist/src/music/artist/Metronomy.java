package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Metronomy {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Metronomy() {
    }
    
    public ArrayList<Song> getMetronomysSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Added the album so we can populate it below
    	 Song track1 = new Song("The Look", "Metronomy");                       //Added a song
         Song track2 = new Song("She Wants", "Metronomy");                      //Added another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Metronomy
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Metronomy 
         return albumTracks;                                                    //Return the songs for the Metronomy in the form of an ArrayList
    }
}
