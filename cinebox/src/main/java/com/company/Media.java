package com.company;

public class Media {

    static final int FRAME_RESOLUTION = 60;
    static final int SECONDS_IN_A_MINUTE = 60;

    String name;
    String genre;
    int duration;

    public static int getTotalFrames(int duration){
        return duration * FRAME_RESOLUTION * SECONDS_IN_A_MINUTE;
    }

    public Media(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public Media(String name, String genre, int duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public Media() {
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

    public void pause(String movie){
        if( movie.isEmpty() ){

            System.out.println("Movie not found");
        }
        else{
            System.out.println("pause movie ... "+movie);
        }
    }
}