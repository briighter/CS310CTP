package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class WilliamScottLeischner_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> usherTracks = new ArrayList<Song>();
    Usher usher = new Usher();
	
    usherTracks = usher.getUshersSongs();
	
	playlist.add(usherTracks.get(0));
	playlist.add(usherTracks.get(1));
	playlist.add(usherTracks.get(2));
	
	KeithSweat keithSweat = new KeithSweat();
	ArrayList<Song> keithSweatTracks = new ArrayList<Song>();
	keithSweatTracks = keithSweat.getkeithSweatsSongs();
		
	playlist.add(keithSweatTracks.get(0));
	playlist.add(keithSweatTracks.get(1));
	
	
	
    return playlist;
	}
}