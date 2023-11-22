import java.util.Scanner;

public class ex100_80 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String a = scan1.nextLine();

        String answer = "";
        int n=-3;

        for(char ch : a.toCharArray()) {
            if(ch==' ') {
                answer += ch;
            }else if(ch>='a'&& ch<='z'){
                answer += (char)('a' + (ch+n-'a')%26);
            }else {
                answer += (char)('A' + (ch+n-'A')%26);
            }
        }
        System.out.println(answer);

    }
}
