import java.util.Scanner;
public class ex100_46 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        int h1 = scan1.nextInt();
        int h2 = scan2.nextInt();
        int h3 = scan3.nextInt();

        if(h1>170){
            System.out.println("PASS");
            if (h2>170) {
                System.out.println("PASS");
                if (h3>170) {
                    System.out.println("PASS");
                }else{
                    System.out.println("CRASH");
                }
            }else{
                System.out.println("CRASH");
            }

        }else{
            System.out.println("CRASH");
        }


    }
}
