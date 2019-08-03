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
	
	//Added Test for new Portico Quartet artist
	@Test
	public void testGetPorticoQuartetAlbumSize() throws NoSuchFieldException, SecurityException {
		 PorticoQuartet porticoQuartetBand = new PorticoQuartet();
		 ArrayList<Song> porticoQuartetTracks = new ArrayList<Song>();
		 porticoQuartetTracks = porticoQuartetBand.getPorticoSongs();
		 assertEquals(2, porticoQuartetTracks.size());
	}
	
	//Added Test for new Beach Fossils artist.
	@Test
	public void testGetBeachFossilsAlbumSize() throws NoSuchFieldException, SecurityException {
		 BeachFossils beachFossilsBand = new BeachFossils();
		 ArrayList<Song> beachFossilsTracks = new ArrayList<Song>();
		 beachFossilsTracks = beachFossilsBand.getBeachSongs();
		 assertEquals(2, beachFossilsTracks.size());
	}
	
}
