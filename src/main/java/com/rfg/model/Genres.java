package com.rfg.model;

/**
 * Created by markvincent9 on 4/26/17.
 */
public class Genres {

    private String genre;

    public String getGenre ()
    {
        return genre;
    }

    public void setGenre (String genre)
    {
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [genre = "+genre+"]";
    }
}
