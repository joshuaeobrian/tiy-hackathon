package com.tiy.hackathon.controller;

import com.tiy.hackathon.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by chrisaanerud on 4/8/17.
 */

@Controller
public class WheelOPhrasesController {



    @Autowired
    PhraseService phraseService;


    @RequestMapping("/")
    public String listPhrases(Model model){

        model.addAttribute("phraseChar", phraseService.getPhrase());
        model.addAttribute("phraseInfo",phraseService.getPhraseInfo());

        return "index";
    }
    @RequestMapping("/character")
    public String getLetter(String letter){


        System.out.println(letter);
        return "redirect:/";
    }

}
