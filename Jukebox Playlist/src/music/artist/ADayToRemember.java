package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class ADayToRemember {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ADayToRemember() {
    }
    
    public ArrayList<Song> getADayToRememberSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The Downfall of Us All", "A Day to Remember"); //Create a song
         Song track2 = new Song("All I Want", "A Day to Remember");             //Create another song
         Song track3 = new Song("Rescue Me", "A Day to Remember");              
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatles
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Beatles 
         this.albumTracks.add(track3);
         return albumTracks;                                                    //Return the songs for the Beatles in the form of an ArrayList
    }
}
