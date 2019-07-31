package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BobMarley {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BobMarley() {
    }
    
    public ArrayList<Song> getBobMarleySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("One Love", "Bob Marley");                      //Creating song One Love by Bob Marley
         Song track2 = new Song("Natural Mystic", "Bob Marley");                //Creating song Natural Mystic by Bob Marley
         Song track3 = new Song("Could You Be Loved", "Bob Marley");            //Creating song Could You Be Loved by Bob Marley
         Song track4 = new Song("Redemption Song", "Bob Marley");               //Creating song Redemption Song by Bob Marley
         this.albumTracks.add(track1);                                          //Add the first song to song list for Bob Marley
         this.albumTracks.add(track2);                                          //Add the second song to song list for Bob Marley 
         this.albumTracks.add(track3);                                          //Add the third song to song list for Bob Marley 
         this.albumTracks.add(track4);                                          //Add the fourth song to song list for Bob Marley 
         return albumTracks;                                                    //Return the songs for the Nas in the form of an ArrayList
    }
}