package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class AdamDiamond_Playlist {
	
	public LinkedList<PlayableSong> StudentPlaylist(){
	//Creates data structures and band objects
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> porticoTracks = new ArrayList<Song>();
	PorticoQuartet porticoQuartetBand = new PorticoQuartet();
	
	porticoTracks = porticoQuartetBand.getPorticoSongs();
	//Adds band tracks to playlist
	playlist.add(porticoTracks.get(0));
	playlist.add(porticoTracks.get(1));
	
	//Creates data structures and band objects
    BeachFossils beachFossilsBand = new BeachFossils();
	ArrayList<Song> beachFossilsTracks = new ArrayList<Song>();
	beachFossilsTracks = beachFossilsBand.getBeachSongs();
	//Adds band tracks to playlist
	playlist.add(beachFossilsTracks.get(0));
	playlist.add(beachFossilsTracks.get(1));
	
	ArrayList<Song> beatlesTracks = new ArrayList<Song>();
    TheBeatles theBeatlesBand = new TheBeatles();
	
    beatlesTracks = theBeatlesBand.getBeatlesSongs();
	
	playlist.add(beatlesTracks.get(0));
	playlist.add(beatlesTracks.get(1));
	
    return playlist;
	}
}