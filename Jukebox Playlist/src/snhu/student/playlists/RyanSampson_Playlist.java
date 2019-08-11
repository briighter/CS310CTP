package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class RyanSampson_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	// Creates a LinkedList of PlayableSongs to store the play list
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	// Creates a TheBeatles object and retrieves the tracks so they can be
	// added to this student's play list.
	ArrayList<Song> beatlesTracks = new ArrayList<Song>();
    TheBeatles theBeatlesBand = new TheBeatles();
    beatlesTracks = theBeatlesBand.getBeatlesSongs();
	
 // Adds first and second tracks (note* first track is at index 0)
	playlist.add(beatlesTracks.get(0));
	playlist.add(beatlesTracks.get(1));
	
	// Creates a ImagineDragons object and retrieves the tracks so they can be
	// added to this student's play list.
    ImagineDragons imagineDragonsBand = new ImagineDragons();
	ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
    imagineDragonsTracks = imagineDragonsBand.getImagineDragonsSongs();
	
    // Adds first and third tracks (note* first track is at index 0)
	playlist.add(imagineDragonsTracks.get(0));
	playlist.add(imagineDragonsTracks.get(2));
	
	// Creates a Metallica object and retrieves the tracks so they can be
	// added to this student's play list.
	Metallica metallica = new Metallica();
	ArrayList<Song> metallicaTracks = new ArrayList<Song>();
	metallicaTracks = metallica.getMetallicasSongs();
	
	// Adds all 5 Metallica tracks (note* first track is at index 0)
	playlist.add(metallicaTracks.get(0));
	playlist.add(metallicaTracks.get(1));
	playlist.add(metallicaTracks.get(2));
	playlist.add(metallicaTracks.get(3));
	playlist.add(metallicaTracks.get(4));
	
	// Creates a Queen object and retrieves the tracks so they can be
	// added to this student's play list.
	Queen queen = new Queen();
	ArrayList<Song> queenTracks = new ArrayList<Song>();
	queenTracks = queen.getQueensSongs();
	
	// Adds all 3 Queen tracks (note* first track is at index 0)
	playlist.add(queenTracks.get(0));
	playlist.add(queenTracks.get(1));
	playlist.add(queenTracks.get(2));
	
	// Creates a TheUsed object and retrieves the tracks so they can be
	// added to this student's play list.
	TheUsed theUsed = new TheUsed();
	ArrayList<Song> theUsedTracks = new ArrayList<Song>();
	theUsedTracks = theUsed.getTheUsedSongs();
	
	// Adds all 3 The Used tracks (*note: first track is at index 0)
	playlist.add(theUsedTracks.get(0));
	playlist.add(theUsedTracks.get(1));
	playlist.add(theUsedTracks.get(2));
	
	// Creates a ADayToRemember object and retrieves the tracks so they can be
	// added to this student's play list.
	ADayToRemember aDayToRemember = new ADayToRemember();
	ArrayList<Song> aDayToRememberTracks = new ArrayList<Song>();
	aDayToRememberTracks = aDayToRemember.getADayToRememberSongs();
	
	// Adds second and third A Day To Remember tracks (*note: first track is at index 0,
	// so second track is at index 1.
	playlist.add(aDayToRememberTracks.get(1));
	playlist.add(aDayToRememberTracks.get(2));
		
    return playlist;
	}
}
