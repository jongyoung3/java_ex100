import java.util.Scanner;

public class ex100_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        String result_n = String.format("%o",num);

        System.out.print(result_n);

    }
}
