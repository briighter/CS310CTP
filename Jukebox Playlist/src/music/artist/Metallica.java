/*
 * Metallica.Java created using TheBeatles.java as a template
 * 
 * @author: Ryan Sampson
 * @version 1.0
 */

package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Metallica {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Metallica() {
    }
    
    public ArrayList<Song> getMetallicasSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album
    	 Song track1 = new Song("Enter Sandman", "Metallica");          	    //Creates a song
         Song track2 = new Song("One", "Metallica");     					    //Creates another song
         Song track3 = new Song("For Whom the Bell Tolls", "Metallica");        //Creates another song
         Song track4 = new Song("Battery", "Metallica");    				    //Creates another song
         Song track5 = new Song("Fade to Black", "Metallica");    				    //Creates another song
         this.albumTracks.add(track1);                                          //Adds the first song to song list for the Metallica
         this.albumTracks.add(track2);                                          //Adds the second song to song list for the Metallica 
         this.albumTracks.add(track3);                                          //Adds the third song to song list for the Metallica 
         this.albumTracks.add(track4);                                          //Adds the fourth song to song list for the Metallica 
         this.albumTracks.add(track5);                                          //Adds the fifth song to song list for the Metallica 
         return albumTracks;                                                    //Return the songs for Metallica in the form of an ArrayList
    }
}
