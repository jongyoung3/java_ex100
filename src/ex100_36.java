import java.util.Scanner;


public class ex100_36 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int n = scan1.nextInt();
        int m = scan2.nextInt();

        if(n>0 && m>0 && n<=10 && m<=10){
            for(int i=1;i<=n;i++){
                for(int j=1; j<=m; j++){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
