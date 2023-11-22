import java.util.Scanner;

public class ex100_75 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        int n=scan1.nextInt();
        boolean prime=true;

        if(n>=2) {
            for (int i = 1; i <= n; i++) {
                if ((n % 1 == 0) && (n % n == 0)) {
                    prime = true;
                }
                if ((i != 1) && (i != n) && (n % i == 0)) {
                    prime = false;

                }
            }
            if (prime) {
                System.out.print("prime");
            }else{
                System.out.print("not prime");
            }
        }
    }
}
