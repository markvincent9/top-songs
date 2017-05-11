package com.rfg.model;

/**
 * Created by markvincent9 on 4/26/17.
 */
public class Artist {

    private String content;

    private String href;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", href = "+href+"]";
    }
}
