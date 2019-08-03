package music.artist;

import snhu.jukebox.playlist.Song;

import java.util.ArrayList;

public class Excision {
    ArrayList<Song> artistTracks;

    public Excision() {
    }

    // Made this get songs since the class name defines that it is Excision. This will allow for easy iteration through
    // the artists if needed in the future (I.E. for each artist getSongs()).
    public ArrayList<Song> getSongs() {

        artistTracks = new ArrayList<Song>();                              // Instantiate the album so we can populate it below
        artistTracks.add(new Song("Gold", "Excision"));              // Add a song to the track list
        artistTracks.add(new Song("Vault", "Excision"));             // Add a song to the track list
        artistTracks.add(new Song("Throwin' Elbows", "Excision"));   // Add a song to the track list
        artistTracks.add(new Song("Drowning", "Excision"));          // Add a song to the track list
        artistTracks.add(new Song("Time Stood Still", "Excision"));  // Add a song to the track list
        return artistTracks;                                               // Return the songs for Excision in the form of an ArrayList
    }
}

