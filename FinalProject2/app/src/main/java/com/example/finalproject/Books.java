package com.example.finalproject;

import java.io.Serializable;

public class Books implements Serializable {

    private String name;
    private int image;
    private double rating;
    private int recommend;
    private String commments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public String getCommments() {
        return commments;
    }

    public void setCommments(String commments) {
        this.commments = commments;
    }

    public Books(String name, int image, double rating, int recommend, String commments) {
        this.name = name;
        this.image = image;
        this.rating = rating;
        this.recommend = recommend;
        this.commments = commments;
    }
}
