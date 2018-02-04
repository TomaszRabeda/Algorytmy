import java.util.Scanner;

public class Suma {
        public static void main(String[] args) {

            Scanner sc  = new Scanner(System.in);
            int n = sc.nextInt();

            int sum = 0;

            for (int i = 0; i < n; i++) {
                try {
                    sum =+ Integer.parseInt(sc.next());
                    System.out.println(sum);

                }
                catch (Exception ex){
                    sc.next();
                    System.out.println(sum);
                }

            }
        }
    }



