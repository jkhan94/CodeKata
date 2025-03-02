/*
테스트케이스 추가
[1, 11, 2, 3] [[0, 3, 1]] [2]
*/
import java.util.*;
class Solution {    
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        
        for(int q=0; q<queries.length; q++){            
            for(int i=queries[q][0]; i<=queries[q][1]; i++){                
                if(arr[i] > queries[q][2]){
                    // arr에 0 포함 가능하므로 0으로 비교 불가. 다른 값으로 초기화
                    // 기존에 저장된 값과 arr[i] 비교해서 작은 값 선택
                    // 처음 비교하는 거면 arr[i] 저장해야 함.
                    answer[q] = answer[q]==-1? arr[i] : Math.min(answer[q], arr[i]);
                }
            }
            
        }
        
        return answer;
    }
}
/*
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
*/