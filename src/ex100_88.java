import java.util.Scanner;

public class ex100_88 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int n=scan1.nextInt();

        int Sn=0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                Sn+=j;
            }
        }
        System.out.println(Sn);
    }
}
