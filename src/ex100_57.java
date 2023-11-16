import java.util.Scanner;

public class ex100_57 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int n1= scan1.nextInt();
        int n2= scan2.nextInt();

        int n1_cal=400;
        int n2_cal=340;
        int n3_cal=170;
        int n4_cal=100;
        int n5_cal=70;

        int sum=0;

        switch (n1){
            case 1:
                sum+=n1_cal;
                break;
            case 2:
                sum+=n2_cal;
                break;
            case 3:
                sum+=n3_cal;
                break;
            case 4:
                sum+=n4_cal;
                break;
            case 5:
                sum+=n5_cal;
                break;
            default:
                break;
        }
        switch (n2){
            case 1:
                sum+=n1_cal;
                break;
            case 2:
                sum+=n2_cal;
                break;
            case 3:
                sum+=n3_cal;
                break;
            case 4:
                sum+=n4_cal;
                break;
            case 5:
                sum+=n5_cal;
                break;
            default:
                break;
        }

        if(sum>500){
            System.out.println("angry");
        }else {
            System.out.println("no angry");
        }

    }
}
