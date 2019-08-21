package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class MiguelOvalles_Playlist {
    
	public static LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> NasTracks = new ArrayList<Song>();
    Nas Nas = new Nas();                                                                      //Error will remain until merged with Module Five Code
	
    NasTracks = Nas.getNasSongs();
	
	playlist.add(NasTracks.get(0));
	playlist.add(NasTracks.get(1));
	
	
    BobMarley BobMarley = new BobMarley();                                                    //Error will remain until merged with Module Five Code
	ArrayList<Song> BobMarleyTracks = new ArrayList<Song>();
    BobMarleyTracks = BobMarley.getImagineDragonsSongs();
	
	playlist.add(BobMarleyTracks.get(0));
	playlist.add(BobMarleyTracks.get(1));
	playlist.add(BobMarleyTracks.get(2));
	
	
	
    Usher Usher = new Usher();                                                                //Error will remain until merged with Module Five Code of classmate
	ArrayList<Song> UsherTracks = new ArrayList<Song>();
    UsherTracks = Usher.getUsherSongs();
	
	playlist.add(UsherTracks.get(0));
	playlist.add(UsherTracks.get(1));
	playlist.add(UsherTracks.get(2));
	
    return playlist;
	}
}
