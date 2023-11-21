import java.util.Scanner;

public class ex100_61 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int a=scan1.nextInt();
        String c=scan2.nextLine();
        int b=scan3.nextInt();


        int sum=0;

        switch (c){
            case "+":
                sum=a+b;
                System.out.println(sum);
                break;
            case "-":
                sum=a-b;
                System.out.println(sum);
                break;
            case "*":
                sum=a*b;
                System.out.println(sum);
                break;
            case "/":
                sum=a/b;
                System.out.println(sum);
                break;
            default:
                break;

        }




    }
}
