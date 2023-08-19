package com.example.myapplication;

public class Post {

    private String title;
    private String headline;
    private int image;
    private String contact;
    private String comment;


    public Post(String title,String headline,int image, String contact,String comment) {
        this.title = title;
        this.headline = headline;
        this.image = image;
        this.contact = contact;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }
    public String getHeadline() {
        return headline;
    }

    public int getImage() {
        return image;
    }

    public String getContact() {
        return contact;
    }

    public String getComment() {
        return comment;
    }

}
