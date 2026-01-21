package com.company;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Movie movieNew = new Movie();
        movieNew.setName("New Movie");
        movieNew.setGenre("Comedy");
        movieNew.setDuration(89);
        movieNew.setWonOscar(true);

        Series serieNew = new Series();
        movieNew.setName("New Serie");
        movieNew.setGenre("Comedy");
        movieNew.setDuration(52);
    }
}