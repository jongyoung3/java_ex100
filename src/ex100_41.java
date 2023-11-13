import java.util.Scanner;
public class ex100_41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int human = scan.nextInt();

        if((human>=30 && human<=40)||(human>=60 && human<=70)){
            System.out.println("win");
        }else{
            System.out.println("lose");
        }



    }
}
