package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Tiesto {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Tiesto() {
    }
    
    public ArrayList<Song> getTiestoSongs() {
    	
    	 albumTracks = new ArrayList<Song>();
    	 	Song track1 = new Song("Wasted", "Tiesto");
        Song track2 = new Song("Red Lights", "Tiesto");
        Song track3 = new Song("Love Comes Again", "Tiesto");
        Song track4 = new Song("Lethal Industry", "Tiesto");
        Song track5 = new Song("In The Dark", "Tiesto");
        this.albumTracks.add(track1);
        this.albumTracks.add(track2);
        this.albumTracks.add(track3);
        this.albumTracks.add(track4);
        this.albumTracks.add(track5);
        return albumTracks;
    }
}
