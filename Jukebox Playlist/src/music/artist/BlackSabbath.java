package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BlackSabbath {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BlackSabbath() {
    }
    
    public ArrayList<Song> getBlackSabbathSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Paranoid", "Black Sabbath");                   //Create a song
         Song track2 = new Song("Fairies Wear Boots", "Black Sabbath");
         Song track3 = new Song("N.I.B", "Black Sabbath");						//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Black Sabbath
         this.albumTracks.add(track2);                                          //Add the second song to song list for Black Sabbath
         this.albumTracks.add(track3);                                          //Add the third song to song list for Black Sabbath
         return albumTracks;                                                    //Return the songs for the Band in the form of an ArrayList
    }
}
