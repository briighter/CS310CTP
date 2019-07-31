package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class WageWar {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public WageWar() {
    }
    
    public ArrayList<Song> getWageWarSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The River", "Wage War");             //Create a song
         Song track2 = new Song("Stitch", "Wage War");        		  //Create another song
         Song track3 = new Song("Low", "Wage War");					  //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Wage War
         this.albumTracks.add(track2);                                          //Add the second song to song list for Wage War
         this.albumTracks.add(track3);											//Add the third song to song list for Wage War
         return albumTracks;                                                    //Return the songs for Wage War in the form of an ArrayList
    }
}
