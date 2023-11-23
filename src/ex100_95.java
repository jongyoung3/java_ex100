import java.util.Scanner;

public class ex100_95 {

    public static void main(String[] args) {
        int cnt[] = new int[26];

        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if (ch >= 'a')
                cnt[ch - 'a']++;
        }

        for (int i = 0; i < 26 ; i++ ){
            System.out.println((char)(97+i) + " : " + cnt[i]);
        }

    }
}
