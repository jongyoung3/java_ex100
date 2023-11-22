import java.util.Scanner;

public class ex100_74 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        int n=scan1.nextInt();

        if(n>=1 && n<=10000){
            for(int i=1; i<=n; i++){
                if(n%i == 0){
                    System.out.print(i+" ");
                }
            }
        }





    }
}
