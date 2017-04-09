package com.tiy.hackathon.service;

import com.tiy.hackathon.controller.PhraseRepository;
import com.tiy.hackathon.model.Phrase;
import com.tiy.hackathon.model.PhraseCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chrisaanerud on 4/7/17.
 */
@Component
public class PhraseService {
   @Autowired
   private PhraseRepository repository;
   private Phrase phraseInfo;


    public ArrayList<PhraseCharacter> getPhrase() {
        this.phraseInfo = repository.getPhrase().get(0);
        ArrayList<PhraseCharacter> phraseCharacters = new ArrayList<>();

        for (char letter : phraseInfo.getPhrase().toCharArray()) {

            phraseCharacters.add(new PhraseCharacter(phraseInfo.getId(),letter));
//            if (letter == ' ') {
//
//
//
//            } else {
//                phraseCharacters.add(new PhraseCharacter(phraseInfo.getId(),'-'));
//            }
        }

        return phraseCharacters;
    }

    public Phrase getPhraseInfo() {
        return phraseInfo;
    }
}

