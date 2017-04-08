package com.tiy.hackathon.main;

import com.tiy.hackathon.model.Bank;
import com.tiy.hackathon.model.GameResults;
import com.tiy.hackathon.model.Player;
import com.tiy.hackathon.model.Wheel;
import com.tiy.hackathon.service.GameService;
import com.tiy.hackathon.service.PhraseService;

import java.util.Scanner;

/**
 * Created by chrisaanerud on 4/7/17.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Prompter prompter = new Prompter(scanner);

        Player player = new Player("Player",new Bank());
        PhraseService phraseService = new PhraseService();
        Wheel spinWheel = new Wheel();
        PhraseService phrase = new PhraseService();

        GameService gameService = new GameService("random phrase");
        System.out.println(gameService.getDisplay());

        while (true){
            prompter.getTitle();
            System.out.println(gameService.getDisplay());

            int wager = spinWheel.spin();
            prompter.promptForGame(wager);

            if(!gameService.isInPhrase(prompter.guess())){
                player.getBank().removeMoney(wager);

            }else {

                player.getBank().addMoney(wager);

            }
prompter.showCurrentStatus(gameService.getIncorrectCount(), gameService.getGuessCount(), player.getBank().getMoney());

        if(gameService.isGameOver() || player.getBank().isBankEmpty()) {
            GameResults results = new GameResults(gameService.getId(), player.getId(), phrase.getId(), player.getBank().isBankEmpty());

            if(!player.getBank().isBankEmpty()){
                player.setWin();
                System.out.println("\nWon:" + player.getWinCount() + " Games" );
//                phrase = phraseService.getPhrase();
                gameService = new GameService("new phrase");

        }else{ System.out.println("\n\nSorry the phrase was: " + gameService.getPhrase());
                break;


        }

        }

        }


    }
}
