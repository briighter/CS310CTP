package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class JustinRooks_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> beatlesTracks = new ArrayList<Song>();
    TheBeatles theBeatlesBand = new TheBeatles();
	
    beatlesTracks = theBeatlesBand.getBeatlesSongs();
	
	playlist.add(beatlesTracks.get(0));
	playlist.add(beatlesTracks.get(1));
	
	
    ImagineDragons imagineDragonsBand = new ImagineDragons();
	ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
    imagineDragonsTracks = imagineDragonsBand.getImagineDragonsSongs();
	
	playlist.add(imagineDragonsTracks.get(0));
	playlist.add(imagineDragonsTracks.get(1));
	playlist.add(imagineDragonsTracks.get(2));
	
	
	ADayToRemember aDayToRememberBand = new ADayToRemember();
	ArrayList<Song> aDayToRememberTracks = new ArrayList<Song>();
	aDayToRememberTracks = aDayToRememberBand.getADayToRememberSongs();
	
	playlist.add(aDayToRememberTracks.get(0));
	playlist.add(aDayToRememberTracks.get(1));
	playlist.add(aDayToRememberTracks.get(2));
	
	TheUsed theUsedBand = new TheUsed();
	ArrayList<Song> theUsedTracks = new ArrayList<Song>();
	theUsedTracks = theUsedBand.getTheUsedSongs();
	
	playlist.add(theUsedTracks.get(0));
	playlist.add(theUsedTracks.get(1));
	playlist.add(theUsedTracks.get(2));
	
    return playlist;
	}
}
