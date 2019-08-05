package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class JudasPriest {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public JudasPriest() {
    }
    
    public ArrayList<Song> getJudasPriestSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   		//Instantiate the album so we can populate it below
    	 Song track1 = new Song("Breaking the Law", "British Steel");           		//Create a song
         Song track2 = new Song("Living After Midnight", "British Steel");      		//Create another song
         Song track3 = new Song("Electric Eye", "Screaming For Vengeance");				//Create another song
         this.albumTracks.add(track1);                                          		//Add the first song to song list for Judas Priest 
         this.albumTracks.add(track2);                                          		//Add the second song to song list for Judas Priest 
         this.albumTracks.add(track3);                                          		//Add the Third song to song list for Judas Priest 
         return albumTracks;                                                    		//Return the songs for Judas Priest in the form of an ArrayList
    }
}
