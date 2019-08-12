package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class CourtneyGliszczynski_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	//Add the artist Biffy Clyro to my playlist
	ArrayList<Song> biffyClyroTracks = new ArrayList<Song>();
    BiffyClyro biffyClyroBand = new BiffyClyro();
    
	//Set where the code should pull the tracks from
    biffyClyroTracks = biffyClyroBand.getBiffyClyroSongs();
    
	//Specify which Biffy Clyro tracks to add to the playlist
	playlist.add(biffyClyroTracks.get(0));
	playlist.add(biffyClyroTracks.get(1));
	
	
	//Add the artist Bring Me the Horizon to my playlist
	BringMeTheHorizon bringMeTheHorizonBand = new BringMeTheHorizon();
	ArrayList<Song> bringMeTheHorizonTracks = new ArrayList<Song>();
	
	//Set where the code should pull the tracks from
	bringMeTheHorizonTracks = bringMeTheHorizonBand.getBMTHSongs();
	
	//Specify which Bring Me the Horizon tracks to add to the playlist
	playlist.add(bringMeTheHorizonTracks.get(0));
	playlist.add(bringMeTheHorizonTracks.get(1));
	
	
	//Add the artist Johnny Cash to my playlist
	JohnnyCash johnnyCashBand = new JohnnyCash();
	ArrayList<Song> johnnyCashTracks = new ArrayList<Song>();
	
	//Set where the code should pull the tracks from
	johnnyCashTracks = johnnyCashBand.getJohnnyCashSongs();
	
	//Specify which Johnny Cash tracks to add to the playlist
	playlist.add(johnnyCashTracks.get(0));
	playlist.add(johnnyCashTracks.get(1));

	
	//Add the artist Linkin Park to my playlist
	LinkinPark linkinParkBand = new LinkinPark();
	ArrayList<Song> linkinParkTracks = new ArrayList<Song>();
	
	//Set where the code should pull the tracks from
	linkinParkTracks = linkinParkBand.getLinkinParkSongs();
	
	//Specify which Linkin Park tracks to add to the playlist
	playlist.add(linkinParkTracks.get(0));
	playlist.add(linkinParkTracks.get(3));
	
    return playlist;
	}
}
