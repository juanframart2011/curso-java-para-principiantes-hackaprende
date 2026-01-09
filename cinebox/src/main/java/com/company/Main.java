package com.company;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] titleArray = new String[]{
          "La naranja mecánica", "Buscando a Nemo","Misión Imposible", "Star wars",
                "Troya", "Yo Robot","Ip Man",
        };

        playMovie(titleArray, 0);
        pause();
    }

    public static void playMovie(String[] movies, int index ){
        String title = movies[index];
        System.out.println("Playing movie: " + title);
    }

    public static void pause(){
        System.out.println("pause...");
    }
}