package com.example.mszhapa.informmeapp;

/**
 * Created by MsZhapa on 19/07/2017.
 */

public class Information {

    private String mTitle;
    private String mSection;
    private String mAuthor;
    private String mDate;
    private String mUrl;


    public Information(String title, String author, String section, String date, String url) {

        mTitle = title;
        mAuthor = author;
        mSection = section;
        mDate = date;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
