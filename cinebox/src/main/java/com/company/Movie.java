package com.company;

import java.util.Random;

public class Movie extends Media {

    boolean wonOscar = false;

    @Override
    public String toString() {
        return "Movie [name=" + name + ", genre=" + genre + ", duration=" + duration + "]";
    }

    public boolean isWonOscar() {
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }
}