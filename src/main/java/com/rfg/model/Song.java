package com.rfg.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by markvincent9 on 4/25/17.
 */

@XmlRootElement(name = "top-song")
public class Song {
    private String title;

    private String artist;

    private String descr;

    private Weeks weeks;

    public Song() {
    }

    public Song(String title, String artist, String descr, Weeks weeks) {
        this.title = title;
        this.artist = artist;
        this.descr = descr;
        this.weeks = weeks;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getArtist ()
    {
        return artist;
    }

    public void setArtist (String artist)
    {
        this.artist = artist;
    }

    public String getDescr ()
    {
        return descr;
    }

    public void setDescr (String descr)
    {
        this.descr = descr;
    }

    @XmlElement(name="weeks")
    public Weeks getWeeks() {
        return weeks;
    }

    public void setWeeks(Weeks weeks) {
        this.weeks = weeks;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", artist = "+artist+", descr = "+descr+", weeks = "+weeks+"]";
    }
}
