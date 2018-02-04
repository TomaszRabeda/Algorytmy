package Zbior;

import java.util.HashMap;
import java.util.Scanner;

public class Zad7KabalistycznyZapisDaty {
    public static void main(String[] args) {

        HashMap<String, Integer> zapisDaty = new HashMap<>();
        zapisDaty.put("A", 1);
        zapisDaty.put("B", 2);
        zapisDaty.put("C", 3);
        zapisDaty.put("D", 4);
        zapisDaty.put("E", 5);
        zapisDaty.put("F", 6);
        zapisDaty.put("G", 7);
        zapisDaty.put("H", 8);
        zapisDaty.put("I", 9);
        zapisDaty.put("K", 10);
        zapisDaty.put("L", 20);
        zapisDaty.put("M", 30);
        zapisDaty.put("N", 40);
        zapisDaty.put("O", 50);
        zapisDaty.put("P", 60);
        zapisDaty.put("Q", 70);
        zapisDaty.put("R", 80);
        zapisDaty.put("S", 90);
        zapisDaty.put("T", 100);
        zapisDaty.put("V", 200);
        zapisDaty.put("X", 300);
        zapisDaty.put("Y", 400);
        zapisDaty.put("Z", 500);

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase().trim();

        int suma = 0;

        for (int i = 0; i <word.length() ; i++) {
            suma += zapisDaty.get(word.substring(i, i+1));

        }

        //jjjj
       System.out.println(suma);
    }
}
