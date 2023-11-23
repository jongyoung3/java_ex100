import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex100_92 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int result;
        List<Integer> k = new ArrayList<>();
        for(int i=0; i<10; i++){
            k.add(scan1.nextInt());
        }
        try {
            for(int i=0; i<k.size(); i++){
                System.out.print(k.get(i)+" ");
            }
            Thread.sleep(5000); //5초
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            result=scan2.nextInt();
            System.out.print(k.get(2));

        }catch(Exception e) { }



    }
}
