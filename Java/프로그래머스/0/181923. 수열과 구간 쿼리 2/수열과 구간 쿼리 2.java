/*
테스트케이스 추가
[1, 11, 2, 3] [[0, 3, 1]] [2]
*/
import java.util.*;
class Solution {
    private static final int arrMax = 1000000;
    
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = arrMax+1;
        
        for(int q=0; q<queries.length; q++){
            min = arrMax+1;            
            for(int i=queries[q][0]; i<=queries[q][1]; i++){                
                if(arr[i] > queries[q][2] && min > arr[i]){
                    min = arr[i];
                }
            }
            
            if(min > arrMax){
                answer.add(-1);
            } else {
                answer.add(min);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}