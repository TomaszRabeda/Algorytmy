package Zbior;

import java.util.Scanner;

public class Zad1WyznaczanieDatyWielkanocy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rok");
        int rokUzytkownika = sc.nextInt();

        int a = rokUzytkownika % 19;
        int b = Math.floorDiv(rokUzytkownika, 100);
        int c = rokUzytkownika % 100;
        int d = Math.floorDiv(b, 4);
        int e = b % 4;
        int f = Math.floorDiv((b+4),25);
        int g = Math.floorDiv((b-f+1),3);
        int h = (19*a +b-d-g+15)%30;
        int i = Math.floorDiv(c,4);
        int k = c%4;
        int l = (32+2*e+2*i-h-k)%7;
        int m = Math.floorDiv((a+11*h+22*l),451);
        int p = (h+l-7*m+114)%31;

        int dzienWielkanocy = p+1;
        int miesiacWielkanocy = Math.floorDiv((h+l-7*m+114),31);

        System.out.println("Dzień: "+ dzienWielkanocy+ "  Miesiąc: "+miesiacWielkanocy);



    }
}
