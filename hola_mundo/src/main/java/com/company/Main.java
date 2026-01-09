package com.company;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String saludo = "Hi, Good morning";
        int logintud = saludo.length();
        System.out.println(logintud);
        char saludo1 = saludo.charAt(0);
        System.out.println(saludo1);
        boolean stringVacio = saludo.isEmpty();
        System.out.println(stringVacio);
        boolean containGood = saludo.contains("Good");
        System.out.println(containGood);

        System.out.println(String.format("Saludo: %s", saludo));
    }
}