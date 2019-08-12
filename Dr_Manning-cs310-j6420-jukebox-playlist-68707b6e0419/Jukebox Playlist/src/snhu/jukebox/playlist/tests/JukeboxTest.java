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
	public void testGetTaylorSwiftsAlbumSize() throws NoSuchFieldException, SecurityException { //Added Taylor Swift for test case
		 TaylorSwift taylorSwift = new TaylorSwift();
		 ArrayList<Song> taylorSwiftsTracks = new ArrayList<Song>();
		 taylorSwiftsTracks = taylorSwift.getTaylorSwiftSongs();
		 assertEquals(3, taylorSwiftsTracks.size());
	}
	
	@Test
	public void testGetTheCranberriesAlbumSize() throws NoSuchFieldException, SecurityException { //Added Cranberries for test case
		 TheCranberries theCranberries = new TheCranberries();
		 ArrayList<Song> theCranberriesTracks = new ArrayList<Song>();
		 theCranberriesTracks = theCranberries.getCranberriesSongs();
		 assertEquals(2, theCranberriesTracks.size());
	}

	
}
