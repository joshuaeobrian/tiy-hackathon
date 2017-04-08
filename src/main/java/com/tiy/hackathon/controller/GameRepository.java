package com.tiy.hackathon.controller;

import com.tiy.hackathon.main.Phrase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by chrisaanerud on 4/7/17.
 */
@Component
public class GameRepository {
    @Autowired
    JdbcTemplate template;

    public void startGame(Phrase phrase) {

        template.update("INSERT INTO game(category_id, datetime) VALUES( ?,now())");

    }
}
