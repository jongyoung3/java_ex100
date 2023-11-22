import java.util.Scanner;

public class ex100_71 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        int n=scan1.nextInt();

        int sum=0;
        for(int i=0; i<n; i++){
            sum+=((int)(Math.random()*9)+1);
        }
        System.out.println(sum);


    }
}
