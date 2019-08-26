package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ElizabethTaylor_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	//Added taylor Swift tracks in place of Beatles from copied TestStudent	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> taylorSwiftsTracks = new ArrayList<Song>();
    TaylorSwift taylorSwift = new TaylorSwift();
	
    taylorSwiftsTracks = taylorSwift.getTaylorSwiftSongs();
	
	playlist.add(taylorSwiftsTracks.get(0));
	playlist.add(taylorSwiftsTracks.get(1));
	playlist.add(taylorSwiftsTracks.get(2));
	
	//Added Cranberries Tracks and information
    TheCranberries theCranberriesBand = new TheCranberries();
	ArrayList<Song> theCranberriesTracks = new ArrayList<Song>();
    theCranberriesTracks = theCranberriesBand.getCranberriesSongs();
	
	playlist.add(theCranberriesTracks.get(0));
	playlist.add(theCranberriesTracks.get(1));
	
	
    return playlist;
	}
}
