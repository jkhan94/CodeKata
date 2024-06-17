import java.util.Arrays;
import java.util.Collections;

public class FruitMerchant {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        // 444 444 222 211
        // 012 345 678 91011
        // 11109 876 543 210

        int answer=0;
        if(score.length < m){
            answer = 0;
        } else {
            Integer[] scoreToInteger = Arrays.stream(score).boxed().toArray(Integer[]::new);
            Arrays.sort(scoreToInteger, Collections.reverseOrder());
            for(int i=m-1;i<scoreToInteger.length;i+=m){
                answer += m*scoreToInteger[i];
            }
        }

        System.out.println(answer);
    }
}
