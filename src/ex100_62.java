import java.util.Scanner;

public class ex100_62 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int a=scan1.nextInt();
        int b=scan2.nextInt();
        int c=scan3.nextInt();

        if(a<=3 && b<=20 && c<=999){
            System.out.print(a);
            if(b<10){
                System.out.print("0"+b);
            }else {
                System.out.print(b);
            }
            if(c<10){
                System.out.print("00"+c);
            } else if (c<100) {
                System.out.print("0"+c);
            } else{
                System.out.print(c);
            }

        }




    }
}
