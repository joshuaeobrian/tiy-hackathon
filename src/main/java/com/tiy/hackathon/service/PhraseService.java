package com.tiy.hackathon.service;

import com.tiy.hackathon.controller.PhraseRepository;
import com.tiy.hackathon.main.Phrase;

/**
 * Created by chrisaanerud on 4/7/17.
 */
public class PhraseService {

    private PhraseRepository repository;

//    public PhraseService(){
//        repository = new PhraseRepository("jdbc:postgresql://localhost:5432/wheelophases");
//    }

    public Phrase getPhrase() throws Exception {
        return repository.getPhrasesByCategory(2);
    }
}
