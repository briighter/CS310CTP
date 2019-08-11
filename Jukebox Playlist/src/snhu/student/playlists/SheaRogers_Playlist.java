package snhu.student.playlists;

import music.artist.BeachFossils;
import music.artist.Excision;
import music.artist.PorticoQuartet;
import music.artist.TheGorillaz;
import snhu.jukebox.playlist.PlayableSong;
import java.util.LinkedList;

public class SheaRogers_Playlist {
    public LinkedList<PlayableSong> StudentPlaylist() {

        LinkedList<PlayableSong> playlist = new LinkedList<>();

        /** The Gorillaz **/
        // Instantiate the artist class
        TheGorillaz theGorillazBand = new TheGorillaz();
        // This enables me to only have to add a song in to the Gorillaz list to add it to the playlist
        playlist.addAll(theGorillazBand.getSongs()); // Add all songs from the Gorillaz to the playlist


        /** Excision **/
        // Instantiate the artist class
        Excision excisionBand = new Excision();
        // This enables me to only have to add a song in to the Excision list to add it to the playlist
        playlist.addAll(excisionBand.getSongs()); // Add all songs from Excision to the playlist

        /** Other individual songs **/
        // Artist from Adam
        BeachFossils beachFossils = new BeachFossils();
        playlist.add(beachFossils.getBeachSongs().get(0));
        playlist.add(beachFossils.getBeachSongs().get(1));

        // Artist from Adam
        PorticoQuartet porticoQuartet = new PorticoQuartet();
        playlist.add(porticoQuartet.getPorticoSongs().get(1));

        return playlist;
    }
}
