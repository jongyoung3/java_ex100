import java.util.Scanner;
public class ex100_42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int human = scan.nextInt();

        if((human>=50 && human<=70)||(human % 6 == 0)){
            System.out.println("win");
        }else{
            System.out.println("lose");
        }



    }
}
