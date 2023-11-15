import java.util.Scanner;

public class ex100_53 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        float a= scan1.nextFloat();
        float b= scan2.nextFloat();

        float rAdd = a+b;
        float rMinus = a-b;
        float rMull = a*b;
        float rDiv = a/b;
        float max = 0;

        if(rAdd>=max){
            max = rAdd;
        } else if (rMinus>=max) {
            max = rMinus;
        } else if (rMull>=max) {
            max = rMull;
        }else if(rDiv>=max){
            max = rDiv;
        }

        System.out.printf("%f", max);


    }
}
