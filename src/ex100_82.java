import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex100_82 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int a=scan1.nextInt();
        int b=scan2.nextInt();

        for(int i=1; i<=9; i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
        for(int j=1; j<=9; j++){
            System.out.println(b+"*"+j+"="+(b*j));
        }

    }
}
