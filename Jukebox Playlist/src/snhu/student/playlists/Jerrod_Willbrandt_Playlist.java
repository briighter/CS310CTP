package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Jerrod_Willbrandt_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	//Playlist built for Jerrod Willbrandt
	//Add Wage War Band songs to JW playlist
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> wageWarTracks = new ArrayList<Song>();
    WageWar wageWarBand = new WageWar();
	
    wageWarTracks = wageWarBand.getWageWarSongs();
	
	playlist.add(wageWarTracks.get(0));
	playlist.add(wageWarTracks.get(1));
	playlist.add(wageWarTracks.get(2));
	
	//Add Bob Segar Band songs to JW playlist
    BobSegar bobSegarBand = new BobSegar();
	ArrayList<Song> bobSegarTracks = new ArrayList<Song>();
    bobSegarTracks = bobSegarBand.getBobSegarSongs();
	
	playlist.add(bobSegarTracks.get(0));
	playlist.add(bobSegarTracks.get(1));
	
	//Add Avicii Band songs to JW playlist from another students band selection
	ArrayList<Song> aviciiTracks = new ArrayList<Song>();
    Avicii avici = new Avicii();
	
    aviciiTracks = avici.getAviciiSongs();
	
	playlist.add(aviciiTracks.get(0));
	playlist.add(aviciiTracks.get(1));
	
    return playlist;
	}
}
