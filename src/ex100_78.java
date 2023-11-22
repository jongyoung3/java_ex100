import java.util.Scanner;

public class ex100_78 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);

        int n1=scan1.nextInt();
        String cal = scan2.nextLine();
        int n2 = scan3.nextInt();
        String cal2 = scan4.nextLine();

        int result=0;

        switch (cal){
            case "+":
                result=n1+n2;
                break;
            case "-":
                result=n1-n2;
                break;
            case "*":
                result=n1*n2;
                break;
            case "/":
                result=n1/n2;
                break;
        }
        System.out.println(result);

    }
}
