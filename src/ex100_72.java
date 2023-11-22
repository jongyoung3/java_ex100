import java.util.Scanner;

public class ex100_72 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int n=scan1.nextInt();
        int num;
        int max=0;

        for(int i=0; i<n; i++){
            num=scan2.nextInt();
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);


    }
}
