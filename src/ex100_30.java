import java.util.Scanner;

public class ex100_30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a>=0){
            System.out.print("plus\n");
            if(a%2 == 0) {
                System.out.print("even\n");
            }
            else{
                System.out.print("odd\n");
            }

        }
        else{
            System.out.print("minus\n");
            if(a%2 == 0) {
                System.out.print("even\n");
            }
            else{
                System.out.print("odd\n");
            }
        }


    }
}
