package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class LinkinPark {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public LinkinPark() {
    }
    
    public ArrayList<Song> getLinkinParkSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Breaking The Habit", "Linkin Park");             //Create a song
         Song track2 = new Song("Blead It Out", "Linkin Park");         //Create another song
         Song track3 = new Song("In the End", "Linkin Park");         //Create another song
         Song track4 = new Song("Burn It Down", "Linkin Park");         //Create another song
         Song track5 = new Song("Numb", "Linkin Park");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Linkin Park
         this.albumTracks.add(track2);                                          //Add the second song to song list for Linkin Park
         this.albumTracks.add(track3);                                          //Add the third song to song list for Linkin Park
         this.albumTracks.add(track4);                                          //Add the fourth song to song list for Linkin Park
         this.albumTracks.add(track5);                                          //Add the fifth song to song list for Linkin Park
         return albumTracks;                                                    //Return the songs for Linkin Park in the form of an ArrayList
    }
}
