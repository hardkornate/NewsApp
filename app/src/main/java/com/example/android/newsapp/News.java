package com.example.android.newsapp;

/**
 * Created by Hardkornate on 7/16/17.
 */

class News {
    private String mTitle = " ";
    private String mSection = " ";
    private String mUrl = "about:blank";

    public News(String title, String section, String url){
        mTitle = title;
        mSection = section;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }

}
