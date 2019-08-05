package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Avicii {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Avicii() {
    }
    
    public ArrayList<Song> getAviciiSongs() {
    	
    	 albumTracks = new ArrayList<Song>();
    	 	Song track1 = new Song("Wake Me Up", "Avicii");
        Song track2 = new Song("Levels", "Avicii");
        Song track3 = new Song("Addicted To You", "Avicii");
        Song track4 = new Song("Broken Arrows", "Avicii");
        Song track5 = new Song("Hey Brother", "Avicii");
        this.albumTracks.add(track1);
        this.albumTracks.add(track2);
        this.albumTracks.add(track3);
        this.albumTracks.add(track4);
        this.albumTracks.add(track5);
        return albumTracks;
    }
}
