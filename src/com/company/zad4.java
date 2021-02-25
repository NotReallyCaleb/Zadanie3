package com.company;

public class zad4 {
    public static int[][] tablica(){
        int n = 6;
        int[][] tablica = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                tablica[i][j] = i+j;
            }
        }
        return tablica;
    }
    public static void main(String[] args) {
        int[][] tablica = tablica();
        for (int i = 0; i < tablica.length; i++){
            for (int j = 0; j < tablica.length; j++){
                System.out.print(tablica[i][j]+ " ");
            }
            System.out.println("");
        }
    }

}
