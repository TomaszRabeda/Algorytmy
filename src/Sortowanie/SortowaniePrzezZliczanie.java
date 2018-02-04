package Sortowanie;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[] toSort = {5, 5, 3, 8, 1, 2, 4, 4, 3};
        int max = -1;

// wyszukiwanie maxa
        for (int i = 0; i < toSort.length; i++) {
            if (max < toSort[i])
                max = toSort[i];

        }
        int[] coutingTable = new int[max + 1];
        // zliczanie
        for (int i = 0; i < toSort.length; i++)
            coutingTable[toSort[i]]++;

        for (int i = 0; i < coutingTable.length; i++) {
            while (coutingTable[i] > 0) {
                System.out.println(i + " ");
                coutingTable[i]--;
            }

        }


    }
}
