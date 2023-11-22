import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex100_81 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int max;
        int min;
        List<Integer> list=new ArrayList<>();

        for(int i=0; i<5; i++){
            list.add(scan1.nextInt());
        }
        max=min=list.get(0);

        for(int j=0; j<5; j++){
            if(max<list.get(j)){
                max=list.get(j);
            }
            if(min>list.get(j)){
                min=list.get(j);
            }
        }

        System.out.println(max);
        System.out.println(min);

    }
}
