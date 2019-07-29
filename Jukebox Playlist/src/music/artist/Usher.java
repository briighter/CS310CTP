package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Usher {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Usher() {
    }
    
    public ArrayList<Song> getUshersSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("OMG", "Usher");                                //Create a song
         Song track2 = new Song("Nice & Slow", "Usher");                        //Create another song 
         Song track3 = new Song("Yeah!", "Usher");                              //Create another song 
         this.albumTracks.add(track1);                                          //Add the first song to song list for Usher
         this.albumTracks.add(track2);                                          //Add the second song to song list for Usher
         this.albumTracks.add(track3);                                          //Add the third song to song list for Usher
         return albumTracks;                                                    //Return the songs for the Usher in the form of an ArrayList
    }
}
