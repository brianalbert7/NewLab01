/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newlab01;
import java.util.Scanner;

/**
 *
 * @author Brian Albert
 */
public class NewLab01 {

    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        Song mySong;
        String songTitleEntered, artistEntered;
        int lengthEntered;
        Scanner input = new Scanner(System.in);

        // Get Data
        System.out.print("Enter song title: ");
        songTitleEntered = input.nextLine();
        
        System.out.print("Enter artist: ");
        artistEntered = input.nextLine();
        
        System.out.print("Enter length in seconds: ");
        lengthEntered = input.nextInt();
        
        //create song object
        mySong = new Song(songTitleEntered, artistEntered, lengthEntered);
        
        System.out.println("You Entered: ");
        System.out.println("Song title: " + mySong.getSongTitle());
        System.out.println("Artist: " + mySong.getArtist());
        System.out.println("Length(seconds): " + mySong.getLengthInSeconds());
    }    
}
