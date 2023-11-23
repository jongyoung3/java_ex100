import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex100_91 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int n=scan1.nextInt(); //입력할 숫자의 개수
        List<Integer> k = new ArrayList<>();
        int tmp;
        int tmp2;

        //n개의 정수 입력
        if(n>0 && n<=1000){
            for(int i=0; i<n; i++){
                tmp=scan2.nextInt();
                if(tmp>0 && tmp<=1000) {
                    k.add(tmp);
                }
            }
        }
        for(int w=0; w<n;w++) {
            for (int j = 0; j < k.size(); j++) {
                System.out.print(k.get(j) + " ");
            }
            System.out.println();

            tmp2=k.get(0);
            k.remove(0);
            k.add(tmp2);

        }


    }
}
