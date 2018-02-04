package Zbior;

public class Zad12PeselWeryfikacja {
    public static void main(String[] args) {

        String pesel = "0000000000";
        int[] waga = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        int suma = 0;

        for (int i = 0; i < pesel.length(); i++) {
            int liczba = Integer.parseInt(pesel.substring(i, i + 1));
            suma = suma + liczba * waga[i];
        }

        if (suma % 10 == 0)
            System.out.println("Poprawny pesel");
        else
            System.out.println("Błędny pesel");

    }
}
