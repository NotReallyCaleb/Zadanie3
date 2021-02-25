package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class zad2 {
    public static int[] get_tablica() {
        Scanner scan = new Scanner(System.in);
        int x = 1;
        System.out.println("Podaj wielkość tablicy: ");
        int wielkosc;
        wielkosc = scan.nextInt();
        System.out.println("Podaj wartość pozycji pierwszej: ");
        int wartosc;
        wartosc = scan.nextInt();
        int[] tablica = new int[wielkosc];
        tablica[0] = wartosc;

        while (x < wielkosc) {
            for (int j = 1;j < wielkosc*wielkosc;j++) {
                if ((j > wartosc) && (j > tablica[x-1]) && (j%2 == 0)){
                    tablica[x] = j;
                    x++;
                    break;
              }
            }
        }

        return tablica;
    }
    public static int min( int[] tablica) {
        int min = tablica[0];

        for (int i: tablica) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int max( int[] tablica) {
        int max = tablica[0];
        for (int i: tablica){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
    public static int suma( int[] tablica) {
        int suma = 0;
        for (int i: tablica) {
            suma += i;
        }
        return suma;
    }
    public static double srednia( int[] tablica) {
        double suma = 0;
        for (double i: tablica) {
            suma += i;
        }
        return suma / tablica.length;
    }
    public static int mediana( int[] tablica) {
        Arrays.sort(tablica);
        int mediana = 0;
        if (tablica.length%2 == 0) {
            int x = tablica[(tablica.length/2) - 1], y = tablica[(tablica.length/2)];
            mediana = (x + y) / 2;
        }
        else {
            mediana = tablica[(tablica.length / 2)];
        }
        return mediana;
    }

    public static void main(String[] args) {
        int[] tablica = get_tablica();
        System.out.println("To twoja tablica: "+Arrays.toString(tablica));
        System.out.println("Wartość najmniejsza: "+min(tablica));
        System.out.println("Wartość największa: "+max(tablica));
        System.out.println("Suma wartości: "+suma(tablica));
        System.out.println("Średnia wartości: "+srednia(tablica));
        System.out.println("Mediana wartości: "+mediana(tablica));
    }
}
