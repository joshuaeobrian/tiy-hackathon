package com.tiy.hackathon.service;

import com.tiy.hackathon.controller.GameRepository;

/**
 * Created by chrisaanerud on 4/6/17.
 */
public class GameService {

    private Integer id;
    private String categoryType;
    private String phrase;
    private String correctLetterGuess;
    private String incorrectLetterGuess;
    private GameRepository repository;

    public GameService(String phrase){
     this.phrase = phrase;
        this.correctLetterGuess = "";
        this.incorrectLetterGuess = "";
    }

//    public GameService(Integer id, String categoryType, String phrase) throws Exception {
//        this.id = id;
//        this.categoryType = categoryType;
//       this.phrase = phrase;
//        this.correctLetterGuess = "";
//        this.incorrectLetterGuess = "";
//    }




    public boolean isInPhrase(char guess) {

        boolean isInPhrase = false;
//        String answer = phrase;
        if (this.phrase.indexOf(guess) == -1) {
            incorrectLetterGuess += guess;


        } else {

            correctLetterGuess += guess;
            isInPhrase = true;

        }

        return isInPhrase;

    }


    public String getDisplay() {
        String display = "";

        for (char letter : phrase.toCharArray()) {


            if (letter == ' ') {

                display += letter;

            } else if (correctLetterGuess.indexOf(letter) != -1) {

                display += letter;

            } else {
                display += "-";
            }
        }
        return display;
    }

    public int getGuessCount() {
        return this.incorrectLetterGuess.length() + this.correctLetterGuess.length();
    }

    public int getIncorrectCount() {
        return this.incorrectLetterGuess.length();
    }


    public boolean isGameOver() {

        String correctGuess = "";
        boolean isEnd = false;
        for (char letter : phrase.toCharArray()) {
            if (this.correctLetterGuess.indexOf(letter) != -1) {
                correctGuess += letter;
            }
            if (letter == ' ') {
                correctGuess += letter;
            }
        }
        if (correctGuess.equals(this.phrase)) {
            isEnd = true;
        }
        return isEnd;

    }

    public String getPhrase() {
        return this.phrase;
    }

    //  private void loadGame(){
    //     this.repository = new GameRepository("jdbc:postgresql://localhost:5432/wheelophases");
    // }

    private void logGame() throws Exception {
        this.id = repository.startGame(phrase);
    }

    public Integer getId() {
        return id;
    }


}
