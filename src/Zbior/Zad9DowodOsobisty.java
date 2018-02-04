package Zbior;

public class Zad9DowodOsobisty {
    public static void main(String[] args) {

        char[] keys = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};

        String dowod = "00000000".toUpperCase();

        char[] dowodArr = dowod.toCharArray();
        int[] sumaCzesciowa = new int[dowodArr.length];

        for (int i = 0; i < dowodArr.length; i++) {
            for (int j = 0; j < keys.length; j++) {
                if (dowodArr[i] == keys[j]) {
                    sumaCzesciowa[i] = value[j];
                    break;
                }
            }
        }
        int[] waga = {7, 3, 1, 9, 7, 3, 1, 7, 3};
        int suma = 0;

        for (int i = 0; i < sumaCzesciowa.length; i++) {
            suma = suma + sumaCzesciowa[i] * waga[i];
        }
        if (suma % 10 == 0)
            System.out.println("Poprawny dowód");
        else {
            System.out.println("Błędny dowód");
        }
    }
}
