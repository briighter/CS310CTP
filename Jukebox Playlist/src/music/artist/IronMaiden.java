package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class IronMaiden {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public IronMaiden() {
    }
    
    public ArrayList<Song> getIronMaidenSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The Trooper", 			"Iron Maiden");         //Create a song
         Song track2 = new Song("Run to the Hills", 	"Iron Maiden");  		//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Iron Maiden
         this.albumTracks.add(track2);                                          //Add the second song to song list for Iron Maiden
         return albumTracks;                                                    //Return the songs for Iron Maiden in the form of an ArrayList
    }
}
