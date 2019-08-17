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
	
	/*
	 * testGetMetronomysAlbumSize() and testGetSantigoldsAlbumSize() added for module5
	 * by Charetta Frierson to test the album sizes for these two newly added artists.
	 */
	@Test
	public void testGetSantigoldsAlbumSize() throws NoSuchFieldException, SecurityException {
		 Santigold santigold = new Santigold();
		 ArrayList<Song> santigoldTracks = new ArrayList<Song>();
		 santigoldTracks = santigold.getSantigoldsSongs();
		 assertEquals(5, santigoldTracks.size());
	}
	
	@Test
	public void testGetMetronomyAlbumSize() throws NoSuchFieldException, SecurityException {
		 Metronomy metronomy = new Metronomy();
		 ArrayList<Song> metronomysTracks = new ArrayList<Song>();
		 metronomysTracks = metronomy.getMetronomysSongs();
		 assertEquals(3, metronomysTracks.size());
	}

}
