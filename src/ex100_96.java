import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;


public class ex100_96 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int n=scan1.nextInt();
        int max=0;
        List<String> list = new ArrayList<>();
        List<Integer> sor = new ArrayList<>();
        for(int i=0; i<2*n; i++){
            list.add(scan2.nextLine());
        }
        for(int i=1; i<= list.size(); i=i+2){
            int numInt = Integer.parseInt(list.get(i));
            sor.add(numInt);
        }
        Collections.sort(sor);
        int idx=list.indexOf(String.valueOf(sor.get(2)));
        idx--;
        System.out.println(list.get(idx));
    }
}
