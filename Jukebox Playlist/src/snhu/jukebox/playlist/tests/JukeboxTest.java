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
	public void testGetBlackSabbathAlbumSize() throws NoSuchFieldException, SecurityException {
		 BlackSabbath blacksabbath = new BlackSabbath();
		 ArrayList<Song> blacksabbathTracks = new ArrayList<Song>();
		 blacksabbathTracks = blacksabbath.getBlackSabbathSongs();
		 assertEquals(3, blacksabbathTracks.size());
	}
	
	@Test
	public void testGetTheBandAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBand theband = new TheBand();
		 ArrayList<Song> thebandTracks = new ArrayList<Song>();
		 thebandTracks = theband.getTheBandSongs();
		 assertEquals(3, thebandTracks.size());
	}
	

	@Test
	public void testGetTiestoAlbumSize() throws NoSuchFieldException, SecurityException {
		 Tiesto tiesto = new Tiesto();
		 ArrayList<Song> tiestoTracks = new ArrayList<Song>();
		 tiestoTracks = tiesto.getTiestoSongs();
		 assertEquals(5, tiestoTracks.size());
	}
	@Test
	public void testGetAviciiAlbumSize() throws NoSuchFieldException, SecurityException {
		 Avicii avicii = new Avicii();
		 ArrayList<Song> aviciiTracks = new ArrayList<Song>();
		 aviciiTracks = avicii.getAviciiSongs();
		 assertEquals(5, aviciiTracks.size());
	}
}

