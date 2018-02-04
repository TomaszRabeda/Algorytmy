package Zbior;

public class Zad3SpacjeCamelCase {
    public static void main(String[] args) {

        String tekst = "Dzisiaj jest czwartek," +
                "a jutro jest piatek.";

        char[] napis = tekst.toCharArray();

        boolean Upper = false;

        for (int i = 0; i < napis.length; i++) {
            if (napis[i] != ' ') {
                if (Upper) {
                    System.out.print(Character.toUpperCase(napis[i]));
                    Upper = false;
                } else {
                    System.out.print(napis[i]);
                }
            } else {
                Upper = true;
            }
        }
    }
}
