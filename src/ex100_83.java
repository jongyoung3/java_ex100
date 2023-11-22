import java.util.Scanner;

public class ex100_83 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int n=scan1.nextInt();


        for(int i=0; i<n; i++){
            for(int j=n-i-1; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
