import java.util.Random;
import java.util.Scanner;

public class ex100_60 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        int a=scan1.nextInt();
        int b=scan2.nextInt();
        int c=scan3.nextInt();
        int car=170;

        if(car<a){
            if (car<b) {
                if (car<c) {
                    System.out.println("PASS");
                }else {
                    System.out.println("CRASH "+c);
                }
            }else {
                System.out.println("CRASH "+b);
            }
        } else {
            System.out.println("CRASH "+a);
        }

    }
}
