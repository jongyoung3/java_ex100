import java.util.Scanner;


public class ex100_100 {
    static void score( int n, int answer ){
        Scanner scan = new Scanner(System.in);

        if(n>answer){
            System.out.println("번호가 정답보다 큽니다.");
            System.out.println("번호를 입력하세요.");
            n = scan.nextInt();
            score(n, answer);
        } else if (n<answer) {
            System.out.println("번호가 정답보다 작습니다.");
            System.out.println("번호를 입력하세요.");
            n = scan.nextInt();
            score(n, answer);
        }else {
            System.out.println("정답입니다.");
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int answer = (int)(Math.random()*100)+1;
        System.out.println("번호를 입력하세요.");
        int n = scan.nextInt();
        score(n, answer);
    }

}
