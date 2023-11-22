import java.util.Scanner;
import java.util.*;
public class ex100_79 {

    public static void main(String[] args) {
        String ouput="";
        char tmp;

        Scanner scan1 = new Scanner(System.in);
        String a = scan1.nextLine();

        for(int i=0; i<a.length(); i++){
            tmp=a.charAt(i);
            if((65<=tmp) && (tmp<=90)) { // 대문자인 경우
                ouput += a.valueOf(tmp).toLowerCase();
            } else if ((97<=tmp) && (tmp<=122)) { // 소문자인 경우
                ouput += a.valueOf(tmp).toUpperCase();
            }else{ // 그 외의 문자열일 경우
                ouput += (char)tmp; // 그대로 넣음
            }
        }

        System.out.println(ouput);

    }
}
