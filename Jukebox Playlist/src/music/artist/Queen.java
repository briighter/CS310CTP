/*
 * Queen.Java created using TheBeatles.java as a template
 * 
 * @author: Ryan Sampson
 * @version 1.0
 */

package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Queen {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Queen() {
    }
    
    public ArrayList<Song> getQueensSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album
    	 Song track1 = new Song("Bohemian Rhapsodye", "Queen");                 //Creates a song
         Song track2 = new Song("Another One Bites the Dust", "Queen");         //Creates another song
         Song track3 = new Song("We Will Rock You", "Queen");        		    //Creates a third song
         this.albumTracks.add(track1);                                          //Adds the first song to song list for the Queen
         this.albumTracks.add(track2);                                          //Adds the second song to song list for the Queen
         this.albumTracks.add(track3);                                          //Adds the third song to song list for the Queen
         return albumTracks;                                                    //Return the songs for Queen in the form of an ArrayList
    }
}
