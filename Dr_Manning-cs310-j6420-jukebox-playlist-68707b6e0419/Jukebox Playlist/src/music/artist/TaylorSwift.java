package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class TaylorSwift {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TaylorSwift() {
    }
     
    public ArrayList<Song> getTaylorSwiftSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("You Need To Calm Down", "Taylor Swift");       //Create Taylor Swift song
         Song track2 = new Song("Welcome to New York", "Taylor Swift");         //Create another Taylor Swift song
         Song track3 = new Song("Mean", "Taylor Swift");                        //Create one more Taylor Swift song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Taylor Swift
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Taylor Swift 
         this.albumTracks.add(track3);                                          //Add third song to song list for Taylor Swift
         return albumTracks;                                                    //Return the songs for Taylor Swift in the form of an ArrayList
    }
}
