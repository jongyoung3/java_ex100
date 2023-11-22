import java.util.Scanner;

public class ex100_66 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        int a=scan1.nextInt();
        int sum=0;
        int i=1;

        if(a>0 && a<=100000000){
            for(i=1;;i++){
                if(sum>=a) break;
                sum+=i;
            }

            System.out.println(sum);
        }







    }
}
