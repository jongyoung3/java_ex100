import java.util.Scanner;

public class ex100_56 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        int n1= scan1.nextInt();
        int n2= scan2.nextInt();
        int n3= scan3.nextInt();
        int n4= scan4.nextInt();

        int sum=n1+n2+n3+n4;

        switch (sum){
            case 0:
                System.out.println("모");
                break;
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
            default:
                break;
        }


    }
}
