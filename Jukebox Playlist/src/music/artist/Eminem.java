package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Eminem {
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Eminem() {
    }
    
    public ArrayList<Song> getEminemSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                       //Instantiate the album so we can populate it below
    	 Song track1 = new Song("My name is", "The Slims Shady LP");               //Create a song
         Song track2 = new Song("My fault", "The Slims Shady LP");        		  //Create another song
         Song track3 = new Song("Rock Bottom", "The Slims Shady LP"); 		      // added track 3
         Song track4 = new Song("Guilty Conscience", "The Slims Shady LP");      // added track 4
         Song track5 = new Song("Cleanin out my closet", "Marshel Mathers LP");    // added track 5
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatles
         this.albumTracks.add(track2);                                         //Add the second song to song list for the Beatles 
         this.albumTracks.add(track3); 									      // added new item to array[2]
         this.albumTracks.add(track4); 									   // added new item to array[3]
         this.albumTracks.add(track5); 											//added new item to array
         return albumTracks;                                              //Return the songs for Eminem in the form of an ArrayList
    }
}



