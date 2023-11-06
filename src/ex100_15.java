import java.util.Scanner;

public class ex100_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();
        String result_m = String.format("%02d",month);
        String result_d = String.format("%02d",day);

        System.out.print(year+"."+result_m+"."+result_d);

    }
}
