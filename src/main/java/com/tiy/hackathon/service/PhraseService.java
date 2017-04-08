package com.tiy.hackathon.service;

import com.tiy.hackathon.controller.PhraseRepository;
import com.tiy.hackathon.model.PhraseCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chrisaanerud on 4/7/17.
 */
@Component
public class PhraseService {
//    @Autowired
//    private PhraseRepository repository;
    private Integer id;



    public List<PhraseCharacter>getPhrase() {
           //  return "This is the word";//repository.getPhrasesByCategory(2);

        List<PhraseCharacter> c = Arrays.asList(new PhraseCharacter("a"), new PhraseCharacter("d"), new PhraseCharacter("s"));
        return c;
    }

    public Integer getId() {
        return id;
    }
}
