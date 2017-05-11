package com.rfg.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by markvincent9 on 4/26/17.
 */
public class TopSong {

    private String title;
    private String artist;
    private List<String> weeks;
    private String album;
    private String released;
    private List<String> genres;
    private String length;
    private String label;
    private List<String> writers;
    private List<String> producers;
    private String descr;

    public TopSong() {
    }

    public TopSong(String title, String artist, List<String> weeks, String album, String released, List<String> genres,
                   String length, String label, List<String> writers, List<String> producers, String descr) {
        this.title = title;
        this.artist = artist;
        this.weeks = weeks;
        this.album = album;
        this.released = released;
        this.genres = genres;
        this.length = length;
        this.label = label;
        this.writers = writers;
        this.producers = producers;
        this.descr = descr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<String> weeks) {
        this.weeks = weeks;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public List<String> getProducers() {
        return producers;
    }

    public void setProducers(List<String> producers) {
        this.producers = producers;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
