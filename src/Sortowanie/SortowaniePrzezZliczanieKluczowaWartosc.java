package Sortowanie;

import java.util.Scanner;

public class SortowaniePrzezZliczanieKluczowaWartosc {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};
        String[] keys = new String[27];

        StringBuilder sb = new StringBuilder();

        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    sb.append(arr[i]).append(arr[j]).append(arr[k]);
                    keys[counter] = sb.toString();
                    sb.setLength(0);
                    counter++;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("ilość ciągów: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] inputUser = new String[n];
        for (int i = 0; i <= n; i++) {
            inputUser[i] = sc.nextLine().toUpperCase();
        }
        int[] counterArray = new int[27];
        for (int i = 0; i < inputUser.length; i++) {
            for (int j = 0; j < keys.length; j++) {
                if (keys[j].equals(inputUser[i])) {
                    counterArray[j]++;
                    break;
                }
            }
        }
        for (int i = 0; i < counterArray.length; i++) {
            while (counterArray[i] > 0) {
                System.out.print(keys[i] + " ");
                counterArray[i]--;
            }
        }
    }
}
// NA SLACKU jest poprawna wersja 28.01

//public class SortowaniePrzezZliczanieKluczWartosc {
//    public static void main(String[] args) {
//        //Część 1: generowanie kluczy i wartości
//
//        char[] arr = {‘A’, ‘B’, ‘C’};
//        String[] keys = new String[27];
//
//        StringBuilder sb = new StringBuilder();
//        int counter = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                for (int k = 0; k < 3; k++) {
//                    sb.append(arr[i]).append(arr[j]).append(arr[k]);
//                    keys[counter] = sb.toString();
//                    sb.setLength(0);
//                    counter++;
//                }
//            }
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println(“Ilość ciągów:“);
//        int n = Integer.parseInt(sc.nextLine());
//
//        String[] inputUser = new String[n];
//        for (int i = 0; i < n; i++) {
//            inputUser[i] = sc.nextLine().toUpperCase();
//        }
//
//        int[] counterArray = new int[27];
//        for (int i = 0; i < inputUser.length; i++) {
//            for (int j = 0; j < keys.length; j++) {
//                if(keys[j].equals(inputUser[i])){
//                    counterArray[j]++;
//                    break;
//                }
//            }
//        }
//
//        for (int i = 0; i < counterArray.length; i++) {
//            while (counterArray[i] > 0){
//                System.out.print(keys[i] + ” “);
//                counterArray[i]--;
//            }
//        }
//    }
//}