package com.rfg.model;

import com.marklogic.client.query.FacetResult;
import com.marklogic.client.query.FacetValue;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by markvincent9 on 4/26/17.
 */

public class SongsSearchResult {

    private List<TopSong> songs;

    private FacetValue[] weeksFacets;
    private FacetValue[] artistFacets;

    public SongsSearchResult() {
    }

    public SongsSearchResult(List<TopSong> songs, FacetResult  weeksFacets, FacetResult  artistFacets) {
        this.songs = songs;
        this.weeksFacets = weeksFacets != null ? weeksFacets.getFacetValues() : null;
        this.artistFacets = artistFacets != null ? artistFacets.getFacetValues() : null;
    }

    public List<TopSong> getSongs() {
        return songs;
    }

    public void setSongs(List<TopSong> songs) {
        this.songs = songs;
    }

    public FacetValue[] getWeeksFacets() {
        return weeksFacets;
    }

    public void setWeeksFacets(FacetValue[] weeksFacets) {
        this.weeksFacets = weeksFacets;
    }

    public FacetValue[] getArtistFacets() {
        return artistFacets;
    }

    public void setArtistFacets(FacetValue[] artistFacets) {
        this.artistFacets = artistFacets;
    }
}
