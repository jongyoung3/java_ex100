import java.util.Scanner;
public class ex100_49 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int hour= scan1.nextInt();
        int minute = scan2.nextInt();
        int temp=0;

        if(hour>=0 && minute>=0 && hour<=23 && minute<=59){
            if(minute>=30){
                System.out.println(hour+" "+(minute-30));
            }else{
                temp=30-minute;
                System.out.println((hour-1)+" "+(60-temp));
            }
        }
    }
}
