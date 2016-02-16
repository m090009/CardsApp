package com.tohamy.cardsapp;

/**
 * Created by tohamy on 2/13/16.
 */
public class NowCard {
    private String title;
    private String content;
    private int imageUrl;

    public NowCard(String title, String content, int imageUrl) {
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
