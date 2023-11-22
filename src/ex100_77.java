import java.util.Scanner;

public class ex100_77 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        int n=scan1.nextInt();
        int result=1;

        if(n>0 && n<=12){
            for(int i=n; i>0; i--){
                result*=i;
            }
            System.out.println(result);
        }
    }
}
