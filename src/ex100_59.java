import java.util.Scanner;
import java.util.Random;
public class ex100_59 {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); // 입력값을 주기 위해 스캐너 생성
            int input[] = new int[7]; // 배열로 값을 입력
            Random random = new Random(); // 랜덤 수 생성
            int lotto[] = new int[7]; // 배열 7개

            /* 랜덤 수 6개 생성 */
            for(int i=0; i<lotto.length-1; i++) { // 0~6까지 하나씩
                lotto[i] = random.nextInt(1); // 랜덤변수 생성 1~45
                for(int j=i; j<lotto.length-1; j++) {
                    if(lotto[i]==lotto[j]) { // 만약 첫번째 수와 두번째 수가 같으면
                        j--; // j룰 하나 빼준다.
                        break;
                    }
                }
            }
            /* 6개의 숫자 입력 */
            for(int k=0; k<lotto.length-1; k++) { // [0] ~ [6-1]
                input[k] = scan.nextInt();
            }
            /* 보너스 번호 입력 */
            for(int b=lotto.length-1; b<lotto.length; b++) { // [6]
                input[b] = scan.nextInt(); // [6]자리에 값 입력
            }

            int sum=0;
            for(int i=0; i<lotto.length-1; i++) { // [0] ~ [6-1] / 랜덤수
                if(input[i]==lotto[i]) { // 내가 입력한 값과 랜덤 수를 배열로 비교
                    sum++; //일치하면 sum에 1을 더해준다.
                }
            }
            int bonus=0;
            for(int b=lotto.length-1; b<lotto.length; b++) { // [6]
                if(input[b]==lotto[b]) // 같은지 비교
                    bonus++;
            }

            /* 일치한 개수에 따라 다르게 출력 */
            if(sum==0)
                System.out.println("0");
            else if(sum==1)
                System.out.println("0");
            else if(sum==2)
                System.out.println("0");
            else if(sum==3)
                System.out.println("5");
            else if(sum==4)
                System.out.println("4");
            else if(sum==5)
                System.out.println("3");
            else if(sum==5 && bonus==1)
                System.out.println("2");
            else if(sum==6 && bonus==0)
                System.out.println("1");
            else if(sum==6 && bonus==1)
                System.out.println("1");
            else
                System.out.println("오류");
    }
}
