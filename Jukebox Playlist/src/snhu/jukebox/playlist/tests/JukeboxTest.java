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
	 * testGetMetallicasAlbumSize() and testGetQueensAlbumSize() added in module 5
	 * by Ryan Sampson to test the album sizes for these two newly added artists.
	 */
	@Test
	public void testGetMetallicasAlbumSize() throws NoSuchFieldException, SecurityException {
		 Metallica metallica = new Metallica();
		 ArrayList<Song> metallicaTracks = new ArrayList<Song>();
		 metallicaTracks = metallica.getMetallicasSongs();
		 assertEquals(5, metallicaTracks.size());
	}
	
	@Test
	public void testGetQueensAlbumSize() throws NoSuchFieldException, SecurityException {
		 Queen queen = new Queen();
		 ArrayList<Song> queensTracks = new ArrayList<Song>();
		 queensTracks = queen.getQueensSongs();
		 assertEquals(3, queensTracks.size());
	}
}
