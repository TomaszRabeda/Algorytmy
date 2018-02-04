package Zajecia0302.Kopiec;

public class Kopiec {
    private int tab[] = new int[15];
    private int n = 0; // romiar bieżący kopca

    void addElementToKopiec(int element) {
        int i = n;
        n++; // zwiększamy liczbę elementów
        int j = Math.floorDiv(i - 1, 2); //indeks rodzica * kopiec1
        while (i > 0 && tab[j] < element) {
            tab[i] = tab[j]; // umieszczanie rodzica na miejscu syna
            i = j;
            j = Math.floorDiv(i - 1, 2);  //obliczamy index ojca
        }
        tab[i] = element;
    }

    int deleteElements() {

        if (n > 0) {
            int root = tab[0];
            n--;
            int element = tab[n];
            int i = 0; // przeszukiwnie drzewa rozpoczynamy
            int j = 1; // wskazuje lewego syna
            while (j < n) {
                if (j + 1 < n && tab[j + 1] > tab[j]) {  // szukamy większego syna
                    j = j + 1;
                }
                if (element > tab[j])
                    break;
                tab[i] = tab[j]; // inaczej kopiujemy większego syna do ojca
                i = j; // przecjhodzimy na pozycję większego syna
                j = 2 * j + 1; // wskazuje lewego syna

            }
            tab[i] = element;
            return root;
        }
        return -1;
    }

    public void rozbierzKopca() {

        int sortedTab[] = new int[n];
        for (int i = n-1; i >= 0; i--) {
            sortedTab[i] = deleteElements();

        }
        for (int i = 0; i < sortedTab.length; i++) {
            System.out.println(sortedTab[i]);

        }
    }

    void printAllElements() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d: %d\n", i, tab[i]);

        }
    }
}
