package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	
	// Improvement: Added test for the new music artist and playlist
	@Test
	public void testGetBlackbearAlbumSize() throws NoSuchFieldException, SecurityException {
		 Blackbear blackbear = new Blackbear();
		 ArrayList<Song> blackbearsTracks = new ArrayList<Song>();
		 blackbearsTracks = blackbear.getBlackbearsSongs();
		 assertEquals(3, blackbearsTracks.size());
	}
	
	// Improvement: Added test for the new music artist and playlist
	@Test
	public void testGetToykoPoliceClubAlbumSize() throws NoSuchFieldException, SecurityException {
		TokyoPoliceClub tokyoPoliceClub = new TokyoPoliceClub();
		 ArrayList<Song> tokyoPoliceClubsTracks = new ArrayList<Song>();
		 tokyoPoliceClubsTracks = tokyoPoliceClub.getTokyoPoliceClubsSongs();
		 assertEquals(3, tokyoPoliceClubsTracks.size());
	}
	
}
