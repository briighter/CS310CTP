package music.artist;

import snhu.jukebox.playlist.Song;

import java.util.ArrayList;

public class TheGorillaz {
    ArrayList<Song> artistTracks;

    public TheGorillaz() {
    }

    public ArrayList<Song> getSongs() {

        artistTracks = new ArrayList<Song>();                                      // Instantiate the album so we can populate it below
        artistTracks.add(new Song("Feel Good Inc.", "The Gorillaz"));        // Add a song to the track list
        artistTracks.add(new Song("On Melancholy Hill", "The Gorillaz"));    // Add a song to the track list
        artistTracks.add(new Song("Clint Eastwood", "The Gorillaz"));        // Add a song to the track list
        artistTracks.add(new Song("DARE.", "The Gorillaz"));                 // Add a song to the track list
        artistTracks.add(new Song("Humility", "The Gorillaz"));              // Add a song to the track list
        return artistTracks;                                                       // Return the songs for the Gorillaz in the form of an ArrayList
    }
}
