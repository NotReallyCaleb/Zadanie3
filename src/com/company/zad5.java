package com.company;

public class zad5 {
    public static int naj_wspol_dziel(int x, int y) {
        while (x != y) {
            if (x > y) {
                x -= y;
            }
            else {
                y -= x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Wynik: " +naj_wspol_dziel(420, 69));
    }
}
