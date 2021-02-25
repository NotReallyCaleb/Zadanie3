package com.company;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy: ");
        int wielkosc = scanner.nextInt();
        int[] tablica = new int[wielkosc];
        for (int i = 0; i < wielkosc; i++){
            System.out.println("Podaj liczbę na pozycji ["+i+"]");
            tablica[i] = scanner.nextInt();
        }
        for (int x : tablica){
            System.out.println(x);
        }
    }
}


