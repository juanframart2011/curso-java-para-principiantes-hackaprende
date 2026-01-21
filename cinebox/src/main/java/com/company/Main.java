package com.company;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Movie movieNew = new Movie("Toy Story", "Familiar", 60);
        Movie movieNew2 = new Movie("Toy Story", "Familiar");
        Movie movieNew3 = new Movie();

        movieNew2.play();
        int movieTotalFrames = movieNew2.getTotalFrames();
        System.out.println(movieTotalFrames);
    }
}