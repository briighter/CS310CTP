package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class KevinDeRespino_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	//Iron Maiden
	ArrayList<Song> ironMaidenTracks = new ArrayList<Song>();
	IronMaiden ironMaiden = new IronMaiden();
	
	//Gets songs from ironmaiden class
	ironMaidenTracks = ironMaiden.getIronMaidenSongs();
    
    //Judas Priest
    ArrayList<Song> judasPriestTracks = new ArrayList<Song>();
    JudasPriest judasPriest = new JudasPriest();
	
    //Gets songs from judaspriest class
    judasPriestTracks = judasPriest.getJudasPriestSongs();
	
    //Adds songs to play list
	playlist.add(ironMaidenTracks.get(0));
	playlist.add(ironMaidenTracks.get(1));
	playlist.add(judasPriestTracks.get(0));
	playlist.add(judasPriestTracks.get(1));
	playlist.add(judasPriestTracks.get(2));
	
    return playlist;
	}
}