package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class CharettaFrierson_Playlist {   //added charettafrierson_playlist class
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> santigoldTracks = new ArrayList<Song>();
    Santigold santigold = new Santigold();
	
    santigoldTracks = santigold.getSantigoldsSongs();
	
	playlist.add(santigoldTracks.get(0));  //added santigold tracks
	playlist.add(santigoldTracks.get(1));
	playlist.add(santigoldTracks.get(2));
	
    Metronomy metronomy = new Metronomy();
	ArrayList<Song> metronomyTracks = new ArrayList<Song>();
    
	metronomyTracks = metronomy.getMetronomysSongs();
	
	playlist.add(metronomyTracks.get(0));    //added metronomy tracks
	playlist.add(metronomyTracks.get(1));
	playlist.add(metronomyTracks.get(2));
	
    return playlist;
	}
}
