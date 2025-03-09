import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        int[] answer = new int[k];        
        
        Arrays.fill(answer, -1);
        
        for(int i=0; i<arr.length; i++){            
            if(!temp.contains(arr[i])){
                temp.add(arr[i]);
            }           
        }
        
        for(int i=0, idx=0; i<answer.length && idx<temp.size(); i++, idx++){  
            answer[i] = temp.get(idx);                  
        }
        
        return answer;
    }
}