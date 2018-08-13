package com.android.jsonregistercheck.model;

/**
 * Created by user on 8/12/2018.
 */

public class PostReview {
    private String message;

    private String success;

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", success = "+success+"]";
    }
}
