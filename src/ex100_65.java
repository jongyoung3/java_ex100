import java.util.Scanner;

public class ex100_65 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int a=scan1.nextInt();

        if(a>0 && a<=10){
            for(int i=1; i<=a; i++){
                if(i==3 || i==6 || i==9){
                    System.out.print("X");
                }else{
                    System.out.print(i);
                }
                System.out.print(" ");
            }
        }






    }
}
