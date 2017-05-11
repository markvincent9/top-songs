package com.rfg.model;

/**
 * Created by markvincent9 on 4/26/17.
 */
public class Writers {

    private String writer;

    public String getWriter ()
    {
        return writer;
    }

    public void setWriter (String writer)
    {
        this.writer = writer;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [writer = "+writer+"]";
    }
}
