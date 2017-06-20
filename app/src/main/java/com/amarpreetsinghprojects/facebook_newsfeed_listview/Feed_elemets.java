package com.amarpreetsinghprojects.facebook_newsfeed_listview;

/**
 * Created by kulvi on 06/17/17.
 */

public class Feed_elemets {

    String title,feed,date;

    public Feed_elemets(String title, String date, String feed) {
        this.title = title;
        this.feed = feed;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getFeed() {
        return feed;
    }

    public String getDate() {
        return date;
    }
}
