package music.artist;

import snhu.jukebox.playlist.Song;

import java.util.ArrayList;

public class Excision {
    ArrayList<Song> albumTracks;
    String albumTitle;

    public Excision() {
    }

    // Made this get songs since the class name defines that it is Excision. This will allow for easy iteration through
    // the artists if needed in the future (I.E. for each artist getSongs()).
    public ArrayList<Song> getSongs() {

        albumTracks = new ArrayList<Song>();                              // Instantiate the album so we can populate it below
        albumTracks.add(new Song("Gold", "Excision"));              // Add a song to the track list
        albumTracks.add(new Song("Vault", "Excision"));             // Add a song to the track list
        albumTracks.add(new Song("Throwin' Elbows", "Excision"));   // Add a song to the track list
        albumTracks.add(new Song("Drowning", "Excision"));          // Add a song to the track list
        albumTracks.add(new Song("Time Stood Still", "Excision"));  // Add a song to the track list
        return albumTracks;                                               // Return the songs for Excision in the form of an ArrayList
    }
}

