package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class ChrisStapleton {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ChrisStapleton() {
    }
    
    public ArrayList<Song> getChrisStapletonSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Tennessee Whiskey", "Chris Stapleton");             //Create a song
         Song track2 = new Song("Parachute", "Chris Stapleton");         //Create another song
         Song track3 = new Song("Broken Halos", "Chris Stapleton");         //Create another song
         Song track4 = new Song("Milionaire", "Chris Stapleton");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Chris Stapleton
         this.albumTracks.add(track2);                                          //Add the second song to song list for Chris Stapleton
         this.albumTracks.add(track3);                                          //Add the third song to song list for Chris Stapleton
         this.albumTracks.add(track4);                                          //Add the fourth song to song list for Chris Stapleton
         return albumTracks;                                                    //Return the songs for Chris Stapleton in the form of an ArrayList
    }
}
