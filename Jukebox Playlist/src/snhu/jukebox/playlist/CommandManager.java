package snhu.jukebox.playlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class CommandManager {
	
	public CommandManager(){
	}
	
	// Improvement 2: Get a list of file names and print
	void printStudentPlaylist() {
		File folder = new File("C:\\Users\\Jason\\Documents\\SNHU\\CS 310 - Collaboration and Team Project\\workspace\\cs310-j6420-jukebox-playlist\\Jukebox Playlist\\src\\snhu\\student\\playlists");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("Playlist " + (i+1) + ": " + listOfFiles[i].getName().substring(0, listOfFiles[i].getName().length()-5));
		  }
		}
	}

	
	// Method to print the main menu
	void printMainMenu(){
		System.out.println("\n\nWelcome to SNHU Jukebox Playlist Music!");
		System.out.println("Enter Student Playlist Name (Example: TestStudent1_Playlist): ");
		System.out.println("Availablie Playlist(s):");						// Improvement 2
		printStudentPlaylist();												// Improvement 2
		System.out.println("Quit: quit");
		System.out.print("Enter a Command : ");
	}
	
	String getCommand(){
		String command="";
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			command = br.readLine();
		}
		catch(Exception e){
			System.out.println("Something went wrong with the system input!   Please try again.");
		}
		return command;
	}
	
	String parseCommand(String command){
		String studentPlaylistRequested ="";
		if(command!=null && command.length()>0){
			studentPlaylistRequested = command;
		}
		else{
			System.out.println("Please enter a valid command.");
		}
		return studentPlaylistRequested;
	}
}