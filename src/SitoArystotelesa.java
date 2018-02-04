import java.util.Scanner;

public class SitoArystotelesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] arr = new boolean[n+1];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= true;

        }
        for (int i = 2; i <arr.length ; i++) {
            for (int j = i+i; j <arr.length ; j+=i) {
                arr[j]=false;

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i])
                System.out.printf("%d ", i);

        }
    }
}
