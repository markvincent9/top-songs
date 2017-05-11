package com.rfg.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by markvincent9 on 4/26/17.
 */

public class Weeks {

    private String last;

    private String[] week;

    public String getLast ()
    {
        return last;
    }

    public void setLast (String last)
    {
        this.last = last;
    }

    public String[] getWeek ()
    {
        return week;
    }

    public void setWeek (String[] week)
    {
        this.week = week;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [last = "+last+", week = "+week+"]";
    }
}
