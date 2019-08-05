package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BiffyClyro {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BiffyClyro() {
    }
    
    public ArrayList<Song> getBiffyClyroSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Medicine", "Biffy Clyro");   			        //Create a song
         Song track2 = new Song("Machines", "Biffy Clyro");      			    //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Biffy Clyro
         this.albumTracks.add(track2);                                          //Add the second song to song list for Biffy Clyro 
         return albumTracks;                                                    //Return the songs for Biffy Clyro in the form of an ArrayList
    }
}
