/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newlab01;

/**
 *
 * @author Brian Albert
 */
public class Song {
    
    /**
     * @param args the command line arguments
     */
    private String songTitle;
    private String artist;
    private int lengthInSeconds;
    
   /**
    * Constructor
    * @param initialSongTitle value for songTitle field
    * @param initialArtist value for artist field
    * @param initialLengthInSeconds value for lengthInSeconds field
    */
    public Song(String initialSongTitle, String initialArtist, int initialLengthInSeconds){
        songTitle = initialSongTitle;
        artist = initialArtist;
        lengthInSeconds = initialLengthInSeconds;
    }
    
   /**
    * The setSongTitle method accepts an argument
    * which is stored in the songTitle field.
    * @param newSongTitle value for songTitle field
    */
    public void setSongTitle(String newSongTitle){
        songTitle = newSongTitle;
    }
    
   /**
    * The setArtist method accepts an argument
    * which is stored in the artist field.
    * @param initialArtist value for artist field
    */
    public void setArtist(String initialArtist){
        artist = initialArtist;
    }
    
   /**
    * The setLengthInSeconds method accepts an argument
    * which is stored in the lengthInSeconds field.
    * @param initialLengthInSeconds value for lengthInSeconds field
    */
    public void setLengthInSeconds(int initialLengthInSeconds){
        lengthInSeconds = initialLengthInSeconds;
    }
    
   /**
    * The getSongTitle method returns the value
    * stored in the songTitle field.
    * @return value from songTitle field
    */
    public String getSongTitle(){
        return songTitle;
    }
    
    /**
    * The getArtist method returns the value
    * stored in the artist field.
    * @return value from artist field
    */
    public String getArtist(){
        return artist;
    }
    
   /**
    * The getLengthInSeconds method returns the value
    * stored in the lengthInSeconds field.
    * @return value from lengthInSeconds field
    */
    public int getLengthInSeconds(){
        return lengthInSeconds;
    }
}
