package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class TedTippets_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	//linked list declaration
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> EminemTracks = new ArrayList<Song>();
    Eminem eminem = new Eminem();
	
    EminemTracks = eminem.getEminemSongs();
	
    
    //adding string elements to adding to the linked list
	playlist.add(EminemTracks.get(0));					
	playlist.add(EminemTracks.get(1));
	playlist.add(EminemTracks.get(2));
	playlist.add(EminemTracks.get(3));
	playlist.add(EminemTracks.get(4));
	

	
    return playlist;
	}
}