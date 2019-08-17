package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class TheBand {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheBand() {
    }
    
    public ArrayList<Song> getTheBandSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("When I paint My Masterpiece", "The Band");     //Create a song
         Song track2 = new Song("Long Black Veil", "The Band");
         Song track3 = new Song("Ophelia", "The Band");							//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Band
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Band 
         this.albumTracks.add(track3);                                          //Add the third song to song list for the Band 
         return albumTracks;                                                    //Return the songs for the Band in the form of an ArrayList
    }
}
