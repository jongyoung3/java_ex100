import java.util.Scanner;

public class ex100_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>=0 && b<=10) {
            double b1 = Math.pow(2, b);
            int k = a * (int) b1;
            System.out.println(k);
        }
    }
}
