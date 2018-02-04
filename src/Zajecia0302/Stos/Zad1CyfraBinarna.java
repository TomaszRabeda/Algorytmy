package Zajecia0302.Stos;

import java.util.Scanner;
import java.util.Stack;

public class Zad1CyfraBinarna {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę N");
        Scanner sc = new Scanner(System.in);

        int liczba = sc.nextInt();
        int podstawa = 2;

        Stack<Integer> stos = new Stack<>();

        do {
            stos.push(liczba % podstawa);
            liczba = Math.floorDiv(liczba, podstawa);

        }
        while (liczba > 0);

        while (!stos.empty()) {
            System.out.println(stos.pop());
        }
    }

}
