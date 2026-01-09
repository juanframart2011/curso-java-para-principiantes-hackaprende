package com.company;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] titleArray = new String[]{
          "La naranja mecánica", "Buscando a Nemo","Misión Imposible", "Star wars",
                "Troya", "Yo Robot","Ip Man",
        };

        String MovieCurrent = playMovie(titleArray, 0);
        pause(MovieCurrent);
    }

    public static String playMovie(String[] movies, int index ){

        if( index < movies.length ){
            String title = movies[index];
            System.out.println("Playing movie: " + title);

            return movies[index];
        }
        else{
            System.out.println("Movie not found");
            return "";
        }
    }

    public static void pause(String movie){
        if( movie.isEmpty() ){

            System.out.println("Movie not found");
        }
        else{
            System.out.println("pause movie ... "+movie);
        }
    }
}