import java.util.Scanner;
public class ex100_47 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int year = scan1.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
