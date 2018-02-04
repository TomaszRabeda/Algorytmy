import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nominalyZl = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] nominalyZuzucia = new int[nominalyZl.length];

        int kwotaZlote = sc.nextInt();

        int aktualnyNominl = 0;
        while (kwotaZlote > 0) {
            if (kwotaZlote >= nominalyZl[aktualnyNominl]) {
                kwotaZlote -= nominalyZl[aktualnyNominl];
                nominalyZuzucia[aktualnyNominl]++;
            } else {
                aktualnyNominl++;
            }

        }
        for (int i = 0; i < nominalyZl.length; i++) {
            if (nominalyZuzucia[i] > 0)
                System.out.printf("%d zł x %d\n", nominalyZl[i],
                        nominalyZuzucia[i]);

        }
    }
}
