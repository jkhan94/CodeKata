package programmers;

import java.util.Arrays;

public class DivisibleNumber {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int count=0;
        for(int items : arr){
            if(items%divisor==0){
                answer[count] = items;
                count++;
            }
        }
        if(count==0){
            answer[0]=-1;
        } else {
            answer = Arrays.stream(answer).sorted().toArray();
        }
        return answer;
    }
}
