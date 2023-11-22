import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class ex100_90 {

    public static void main(String[] args) {
        List<Integer> k = new ArrayList<>();

        for(int i=0; i<10; i++){
            k.add((int)((Math.random()*23)+1));
        }

        Collections.sort(k);

        for(int j=0; j<k.size(); j++){
            System.out.print(k.get(j)+" ");
        }

    }
}
