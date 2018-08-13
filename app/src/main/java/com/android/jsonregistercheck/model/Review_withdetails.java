package com.android.jsonregistercheck.model;

/**
 * Created by user on 8/12/2018.
 */

public class Review_withdetails {
    private String name;

    private String image;

    private String review;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getReview ()
    {
        return review;
    }

    public void setReview (String review)
    {
        this.review = review;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", image = "+image+", review = "+review+"]";
    }
}
