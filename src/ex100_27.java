import java.util.Scanner;

public class ex100_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("%d", a>b?a:b);
    }
}
