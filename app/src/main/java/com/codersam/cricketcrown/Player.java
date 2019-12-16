package com.codersam.cricketcrown;

public class Player {

    /** Default translation for the word */
    private String PlayerName;

    /** Miwok translation for the word */
    private String PlayerPost;

    private int playerImageID;


    /**
     * Create a new Word object.
     *  @param defaultName is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param defaultPosition is the word in the Miwok language
     *
     */
    public Player(String defaultName, String defaultPosition, int playerImageID) {
        PlayerName = defaultName;
        PlayerPost = defaultPosition;
        this.playerImageID = playerImageID;
    }


    /**
     * Get the default translation of the word.
     */
    public String getPlayerName() {
        return PlayerName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getPlayerPost() {
        return PlayerPost;
    }

    public int getPlayerImageID(){
        return playerImageID;
    }

}
