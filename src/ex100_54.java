import java.util.Scanner;

public class ex100_54 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int a= scan1.nextInt();
        int b= scan2.nextInt();

        if(a%b == 0){
            System.out.println(b+"*"+(a/b)+"="+a);
        } else if (b%a == 0) {
            System.out.println(a+"*"+(b/a)+"="+b);
        }


    }
}
