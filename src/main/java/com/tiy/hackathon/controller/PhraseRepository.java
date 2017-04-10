package com.tiy.hackathon.controller;

import com.tiy.hackathon.model.Phrase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by chrisaanerud on 4/7/17.
 */
@Component
public class PhraseRepository {
    /**
     *
     */
    @Autowired
    public JdbcTemplate template;



    public List<Phrase> getPhrase(){
        return template.query("SELECT p.id AS id,upper(p.phrase) AS phrase, c.id AS cat_id, c.category_type AS category FROM phrases AS p\n" +
                "    JOIN categories AS c ON p.category_id = c.id\n" +
                "    WHERE category_id=2\n" +
                "ORDER BY RANDOM()\n" +
                "LIMIT 1;",((rs, i) -> new Phrase(rs.getInt("id"),rs.getInt("cat_id"),
                rs.getString("category"),rs.getString("phrase"))));
    }

    public List<Phrase> getPhraseByID(int id){
        return template.query("SELECT p.id AS id, upper(p.phrase) AS phrase, c.id AS cat_id, c.category_type AS category FROM phrases AS p\n" +
                "    JOIN categories AS c ON p.category_id = c.id\n" +
                "    WHERE p.id="+id+"\n",(rs,i)-> new Phrase(rs.getInt("id"),rs.getInt("cat_id"),
                rs.getString("category"),rs.getString("phrase")));
    }


}
