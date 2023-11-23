import java.util.Scanner;


public class ex100_99 {
    static void score( int n ){
        if(n>=90){
            System.out.println("A학점");
        } else if (n>=80) {
            System.out.println("B학점");
        }else if (n>=70) {
            System.out.println("C학점");
        }else if (n>=60) {
            System.out.println("D학점");
        }else {
            System.out.println("E학점");
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        score(n);
    }

}
