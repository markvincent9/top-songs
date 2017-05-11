package com.rfg.model;

/**
 * Created by markvincent9 on 4/26/17.
 */
public class Formats {
    private String format;

    public String getFormat ()
    {
        return format;
    }

    public void setFormat (String format)
    {
        this.format = format;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [format = "+format+"]";
    }
}
