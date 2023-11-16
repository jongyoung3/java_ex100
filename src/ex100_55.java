import java.util.Scanner;

public class ex100_55 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int a= scan1.nextInt();

        if(a>=90 && a<=100){
            System.out.println("A");
        } else if (a>=80) {
            System.out.println("B");
        }else if (a>=70) {
            System.out.println("C");
        }else if (a>=60) {
            System.out.println("D");
        }else if(a>=0){
            System.out.println("F");
        }


    }
}
