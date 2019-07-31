package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestStudent3_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> EminemTracks = new ArrayList<Song>();
    Eminem eminem = new Eminem();
	
    EminemTracks = eminem.getEminemSongs();
	
	playlist.add(EminemTracks.get(0));
	playlist.add(EminemTracks.get(1));
	playlist.add(EminemTracks.get(2));
	playlist.add(EminemTracks.get(3));
	
	
    return playlist;
	}
}