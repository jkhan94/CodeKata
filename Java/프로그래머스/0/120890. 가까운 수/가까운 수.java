class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = Integer.MAX_VALUE;
        int temp = 0;
        
        for(int a : array){
            temp = Math.abs(n-a);
            if(diff > temp){
                diff = temp;
                answer = a;
            } else if(diff == temp){
                answer = Math.min(answer, a);
            }
        }
        
        return answer;
    }
}
/*
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);

        for(int i = 1; i < array.length; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        
        return array[0];
    }
}
*/