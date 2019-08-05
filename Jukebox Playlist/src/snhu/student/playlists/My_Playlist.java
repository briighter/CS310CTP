package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class My_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> aviciiTracks = new ArrayList<Song>();
    Avicii avici = new Avicii();
	
    aviciiTracks = avici.getAviciiSongs();
	
	playlist.add(aviciiTracks.get(0));
	playlist.add(aviciiTracks.get(1));
	playlist.add(aviciiTracks.get(2));
	playlist.add(aviciiTracks.get(3));
	playlist.add(aviciiTracks.get(4));
	
	ArrayList<Song> tiestoTracks = new ArrayList<Song>();
    Tiesto tiesto = new Tiesto();
	
    tiestoTracks = tiesto.getTiestoSongs();
	
	playlist.add(tiestoTracks.get(0));
	playlist.add(tiestoTracks.get(1));
	playlist.add(tiestoTracks.get(2));
	playlist.add(tiestoTracks.get(3));
	playlist.add(tiestoTracks.get(4));
	
    return playlist;
	}
}