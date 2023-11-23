import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex100_94 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        char result;
        String k = scan1.nextLine();

        int n1=0, n2=0, size=k.length();

        for(int i=0; i< size; i++){
            result=k.charAt(i);
            switch (result){
                case '(':
                    n1++;
                    break;
                case ')':
                    n2++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(n1+" "+n2);





    }
}
