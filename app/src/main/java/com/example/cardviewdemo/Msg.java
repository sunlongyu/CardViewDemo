package com.example.cardviewdemo;

public class Msg {
    private int id;
    private int imageUrl;
    private String title;
    private String context;

    public Msg(int id, int imageUrl, String title, String context) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.context = context;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
