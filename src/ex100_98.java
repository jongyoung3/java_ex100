import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ex100_98 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // 흰돌의 개수
        int x, y;

        int [][]list = new int[10][10];

        for(int k1=0; k1<10; k1++){
            for(int k2=0; k2<10; k2++){
                list[k1][k2]=0;
            }
        }

        if(n>0 && n<=10){
            for(int i=0; i<n; i++){
                System.out.print("X:");
                x=scan.nextInt();

                System.out.print("Y:");
                y=scan.nextInt();
                if(x>=1 && x<=9 && y>=1 && y<=9){
                    list[x-1][y-1]=1;
                }
            }
        }
        for(int k1=0; k1<10; k1++){
            for(int k2=0; k2<10; k2++){
                System.out.print(list[k1][k2]+" ");
            }
            System.out.println();
        }


     }
}
