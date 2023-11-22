import java.util.Scanner;

public class ex100_86 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int n=scan1.nextInt();

        if((n>=3) && (n<=99) && (n%2 != 0)){
            for(int i=0; i<n; i++){
                if((i+1)%2==0){
                    System.out.println(" ");
                    continue;
                }else{
                    for(int j=n-i-1; j<n; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
        }



    }
}
