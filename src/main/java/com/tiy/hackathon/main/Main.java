package com.tiy.hackathon.main;

import com.tiy.hackathon.model.Bank;
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
        Phrase phrase = phraseService.getPhrase();
        GameService gameService = new GameService(phrase);



    }
}
