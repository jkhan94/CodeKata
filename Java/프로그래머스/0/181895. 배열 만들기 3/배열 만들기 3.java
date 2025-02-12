class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int s1 = intervals[0][0];
        int e1 = intervals[0][1];
        int s2 = intervals[1][0];
        int e2 = intervals[1][1];
        
        int[] answer = new int[e1-s1 + e2-s2 +2];
        int idx=0;
        
        for(int i=s1; i<=e1; i++){
            answer[idx++] = arr[i];            
        }
        for(int i=s2; i<=e2; i++){
            answer[idx++] = arr[i];            
        }        
        
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                answer.add(arr[j]);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
*/