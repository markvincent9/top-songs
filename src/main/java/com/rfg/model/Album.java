package com.rfg.model;

/**
 * Created by markvincent9 on 4/26/17.
 */
public class Album {

    private String content;

    private String uri;

    private String url;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getUri ()
    {
        return uri;
    }

    public void setUri (String uri)
    {
        this.uri = uri;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", uri = "+uri+", url = "+url+"]";
    }
}
