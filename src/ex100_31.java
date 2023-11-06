import java.util.Scanner;

public class ex100_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a>=90 && a<=100){
            System.out.print("A\n");


        }
        else if(a>=70){
            System.out.print("B\n");

        }
        else if(a>=40){
            System.out.print("C\n");

        }
        else if(a>=0){
            System.out.print("D\n");

        }


    }
}
