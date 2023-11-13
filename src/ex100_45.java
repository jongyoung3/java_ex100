import java.util.Scanner;
public class ex100_45 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        int a = scan1.nextInt();
        int b = scan2.nextInt();
        int c = scan3.nextInt();

        double x1, x2;
        int D=b*b-4*a*c; // 근의 판별식

        // 방정식의 해
        x1=((-b) + Math.sqrt(D) ) / (2 * a);
        x2=((-b) - Math.sqrt(D) ) / (2 * a);

        if(D==0){
            System.out.printf("방정식의 해는 %.2f\n",x1);
        } else if (D>0) {
            System.out.printf("방정식의 해는 %.2f\n",x1);
            System.out.printf("방정식의 해는 %.2f\n",x2);
        }else{
            System.out.println("실근이 없습니다.");
        }


    }
}
