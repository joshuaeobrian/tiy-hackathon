package com.tiy.hackathon.service;

import com.tiy.hackathon.controller.PhraseRepository;

/**
 * Created by chrisaanerud on 4/7/17.
 */
public class PhraseService {

    private PhraseRepository repository;
    private Integer id;

    public PhraseService(){
//        repository = new PhraseRepository("jdbc:postgresql://localhost:5432/wheelophases");
    }

    public String getPhrase() throws Exception {
           //  return "This is the word";//repository.getPhrasesByCategory(2);
        return getPhrase() ;
    }

    public Integer getId() {
        return id;
    }
}
