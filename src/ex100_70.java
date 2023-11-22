import java.util.Scanner;

public class ex100_70 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int a=scan1.nextInt();
        int r=scan2.nextInt();
        int n=scan3.nextInt();

        int result=0;

        if(a>0 && a<=7 && r>0 && r<=7 && n>0 && n<=7){
            result=a;
            for(int i=0;i<n-1;i++){
                result*=r;
            }
            System.out.println(result);
        }
    }
}
