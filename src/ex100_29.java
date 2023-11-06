import java.util.Scanner;

public class ex100_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a>=0 && b>=0 && c>=0){
            if(a%2 == 0) {
                System.out.print("even\n");
            }
            else{
                System.out.print("odd\n");
            }
            if(b%2 == 0) {
                System.out.print("even\n");
            }
            else{
                System.out.print("odd\n");
            }
            if(c%2 == 0) {
                System.out.print("even\n");
            }
            else{
                System.out.print("odd\n");
            }
        }


    }
}
