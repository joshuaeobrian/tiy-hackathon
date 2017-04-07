package com.tiy.hackathon.model;

/**
 * Created by chrisaanerud on 4/6/17.
 */
public class Game {

    private Integer id;
    private String categoryType;
    private String phrase;

    public Game() {
    }

    public Game(Integer id, String categoryType, String phrase) {
        this.id = id;
        this.categoryType = categoryType;
        this.phrase = phrase;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
}
