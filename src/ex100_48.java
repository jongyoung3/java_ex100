import java.util.Scanner;
public class ex100_48 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String birth= scan1.nextLine();
        int sex = scan2.nextInt();
        int temp=0;
        char a;

        switch (sex){
            case 1:
            case 2:
                a=birth.charAt(0);
                temp+= Character.getNumericValue(a)*10;
                a=birth.charAt(1);
                temp+=Character.getNumericValue(a);
                temp+=1900;
                temp=2012-temp+1;
                System.out.println(temp);
                break;
            case 3:
            case 4:
                a=birth.charAt(0);
                temp+= Character.getNumericValue(a)*10;
                a=birth.charAt(1);
                temp+=Character.getNumericValue(a);
                temp+=1900;
                temp=2012-temp+1;
                System.out.println(temp);
                break;
        }
    }
}
