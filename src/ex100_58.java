import java.util.Scanner;

public class ex100_58 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        int n1= scan1.nextInt();
        int n2= scan2.nextInt();
        int n3= scan3.nextInt();

        int a=0,b=0;

        int max=0;
        if(n1>max){
            max=n1;
            a=n2; b=n3;
        } else if (n2>max) {
            max=n2;
            a=n1; b=n3;
        } else if (n3>max) {
            max=n3;
            a=n2; b=n1;
        }

        if(max<(a+b)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
