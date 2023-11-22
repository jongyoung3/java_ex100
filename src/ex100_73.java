import java.util.Scanner;

public class ex100_73 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int k=scan1.nextInt();
        int h=scan2.nextInt();

        int sum=0;
        int arr[]={1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120};

        sum+=arr[k-1];
        sum+=arr[h-1];

        System.out.println(sum);


    }
}
