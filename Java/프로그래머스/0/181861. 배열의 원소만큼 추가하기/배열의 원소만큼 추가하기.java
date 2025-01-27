class Solution {
    public int[] solution(int[] arr) {
        int sum=0;
        for(int a:arr){
            sum+=a;
        }       
        int[] answer = new int[sum];
        
        int idx=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[idx]=arr[i];
                idx++;
            }            
        }
        
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer.add(arr[i]);
            }            
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
*/