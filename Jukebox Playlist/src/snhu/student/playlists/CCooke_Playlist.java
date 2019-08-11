package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class CCooke_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> triviumTracks = new ArrayList<Song>();
    Trivium triviumBand = new Trivium();
	
    triviumTracks = triviumBand.getTriviumSongs();
	
	playlist.add(triviumTracks.get(0));
	playlist.add(triviumTracks.get(1));
	playlist.add(triviumTracks.get(2));
	
	
    IPrevail iPrevailBand = new IPrevail();
	ArrayList<Song> iPrevailTracks = new ArrayList<Song>();
	iPrevailTracks = iPrevailBand.getIPrevailSongs();
	
	playlist.add(iPrevailTracks.get(0));
	playlist.add(iPrevailTracks.get(1));
	
    return playlist;
	}
}
