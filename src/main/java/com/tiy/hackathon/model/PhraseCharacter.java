package com.tiy.hackathon.model;

/**
 * Created by chrisaanerud on 4/8/17.
 */
public class PhraseCharacter{
    private Integer phraseID;
    private Character phraseChar;

    public PhraseCharacter(Integer phraseID,Character phraseChar) {
        this.phraseID = phraseID;
        this.phraseChar = phraseChar;
    }

    public Character getPhraseChar() {
        return phraseChar;
    }

    public void setPhraseChar(Character phraseChar) {
        this.phraseChar = phraseChar;
    }

    public Integer getPhraseID() {
        return phraseID;
    }

    public void setPhraseID(Integer phraseID) {
        this.phraseID = phraseID;
    }
}
