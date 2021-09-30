package com.company;

public class Main {

    public static void main(String[] args) {
        int kiekis = 10;
        int neigiamiSkaiciai = 0;
        int[] skaiciai = new int[kiekis];
        skaiciai = new int[]{10, -96, 45, 78, 45, 15, -95, -777, -5, 105};
        System.out.println("Skaičiai masyve: " + kiekis);
        for (int i = 0; i < 10; i++) {
            if (skaiciai[i] < 0) {
                System.out.println(skaiciai[i]);
                neigiamiSkaiciai++;
            }
        }
        System.out.println("Neigiami skaičiai: " + neigiamiSkaiciai);
    }
}
