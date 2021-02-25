package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class zad3 {
    public static int[] dodawanie_tablic() {
        Scanner scannner = new Scanner(System.in);
        System.out.println("Podaj wielkość: ");
        int wielkosc;
        wielkosc = scannner.nextInt();
        int[] tablica1 = new int[wielkosc];
        int[] tablica2 = new int[wielkosc];
        int[] tablica3 = new int[wielkosc];

        for (int i = 0; i < wielkosc; i++) {
            System.out.println("Podaj liczbe na pozycji tablicy pierwszej["+i+"]");
            tablica1[i] = scannner.nextInt();
        }
        for (int i = 0; i < wielkosc; i++) {
            System.out.println("Podaj liczbe na pozycji tablicy drugiej[" + i + "]");
            tablica2[i] = scannner.nextInt();
        }
        for (int i = 0; i < wielkosc; i++) {
            tablica3[i] = tablica1[i] + tablica2[i];
        }
        return tablica3;
    }

    public static void main(String[] args) {
        System.out.println("Wynik: " +Arrays.toString(dodawanie_tablic()));
    }
}