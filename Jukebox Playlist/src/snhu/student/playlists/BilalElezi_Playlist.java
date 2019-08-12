package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class BilalElezi_Playlist {
	public LinkedList<PlayableSong> StudentPlaylist(){
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		ArrayList<Song> aviciiTracks = new ArrayList<Song>();
	    Avicii taviciiArtist = new Avicii();
		
	    aviciiTracks = taviciiArtist.getAviciiSongs();
		
		playlist.add(aviciiTracks.get(0));
		playlist.add(aviciiTracks.get(1));
		
		
		ArrayList<Song> tiestoTracks = new ArrayList<Song>();
	    Tiesto tiestoArtist = new Tiesto();

	    tiestoTracks = tiestoArtist.getTiestoSongs();
	    
		playlist.add(tiestoTracks.get(0));
		playlist.add(tiestoTracks.get(1));
		playlist.add(tiestoTracks.get(2));
		
	    return playlist;
	}
}
