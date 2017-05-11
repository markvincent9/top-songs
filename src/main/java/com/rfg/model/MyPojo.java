package com.rfg.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by markvincent9 on 4/26/17.
 */
public class MyPojo {
    private TopSong TopSong;

    public TopSong getTopSong ()
    {
        return TopSong;
    }

    public void setTopSong (TopSong TopSong)
    {
        this.TopSong = TopSong;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TopSong = "+TopSong+"]";
    }
}
