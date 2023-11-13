import java.util.Scanner;
public class ex100_39 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        int a = scan1.nextInt();
        int b = scan2.nextInt();
        int c = scan3.nextInt();

        int min=0;
        if(a>b){
            min=b;
            if(b>c){
                min=c;
            }
        }else{
            min=a;
            if(a>c){
                min=c;
            }
        }

        System.out.println(min);

    }
}
