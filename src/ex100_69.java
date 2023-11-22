import java.util.Scanner;

public class ex100_69 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int a=scan1.nextInt();
        int d=scan2.nextInt();
        int n=scan3.nextInt();

        int result=0;

        if(a>0 && a<=100 && d>0 && d<=100 && n>0 && n<=100){

            result=a+d*(n-1);
            System.out.println(result);



        }







    }
}
