package com.example.the_spring_cinema.models;

public class Movie {

    private int id;
    private String title;
    private String rating;
    private int duration;

    public Movie(int id, String title, String rating, int duration){
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

//    GETTERS AND SETTERS:


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
