package com.company;

import java.util.Random;

public class Movie {

    String name;
    String genre;
    int duration;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public Movie(String name, String genre, int duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public Movie() {
        this.name = "Not Name";
        this.genre = "Not Genre";
        this.duration = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void play(){

        System.out.println("Playing movie: " + name);
    }

    public void pause(){

        System.out.println("Playing movie: " + name);
    }

    public static void pause(String movie){
        if( movie.isEmpty() ){

            System.out.println("Movie not found");
        }
        else{
            System.out.println("pause movie ... "+movie);
        }
    }

    public int getTotalFrames(int duration){
        return duration * 60 * 60;
    }
}