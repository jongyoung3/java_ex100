import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ex100_97 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // 학생 수
        int c = scan.nextInt();// 한줄에 앉을 수 있는 자리수

        List<Integer> list = new ArrayList<>();

        if(n>0 && n<100 && c>0 && c<=10){
            for(int i=0; i<n; i++)
                list.add(scan.nextInt());
        }
        Collections.sort(list);

        for(int j=0; j< list.size(); j++){
            if(j%c == 0){
                System.out.println();
            }
            System.out.print(list.get(j)+" ");

        }
     }
}
