import java.util.Scanner;
import java.util.stream.Stream;

public class ex100_51 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int num= scan1.nextInt();

        if(num>=1 && num<=99){
            int[] arrNum = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
            if(arrNum[1] == 0){
                int result1 = arrNum[0];
                result1 *= 2;
                System.out.println(result1);
                if(result1 <= 50){
                    System.out.println("GOLD");
                }else{
                    System.out.println("OH MY GOD");
                }
            }else{
                int result2 = arrNum[1]*10;
                result2 += arrNum[0];
                result2 *= 2;
                System.out.println(result2);
                if(result2 <= 50){
                    System.out.println("GOLD");
                }else{
                    System.out.println("OH MY GOD");
                }
            }
        }


    }
}
