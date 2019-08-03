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

	@Test
	public void testGetExcisionsSongs() throws SecurityException {
		Excision excision = new Excision(); // Instantiate Excision class
		excision.getSongs().forEach(song -> assertNotNull("One of the songs for Excision is null", song)); // Ensure there are no null songs
		assertTrue("There are no songs for Excision",excision.getSongs().size() > 0); // Ensure that the artist has at least one song
	}

	@Test
	public void testGetTheGorillazSongs() throws SecurityException {
		TheGorillaz gorillaz = new TheGorillaz(); // Instantiate Excision class
		gorillaz.getSongs().forEach(song -> assertNotNull("One of the songs for The Gorillaz is null", song)); // Ensure there are no null songs
		assertTrue("There are no songs for The Gorillaz",gorillaz.getSongs().size() > 0); // Ensure that the artist has at least one song
	}
	
}
