import java.util.Scanner;

public class ex100_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        float num3 = scan.nextFloat();

        int sum=(int)(num1+num2+num3);
        float avr=(num1+num2+num3)/3;

        System.out.println(sum);
        System.out.printf("%.1f",avr);

    }
}
