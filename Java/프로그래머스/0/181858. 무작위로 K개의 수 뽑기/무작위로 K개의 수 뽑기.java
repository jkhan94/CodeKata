import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        int[] answer = new int[k];        
        int idx=0;
        
        Arrays.fill(answer, -1);
        
        for(int i=0; i<arr.length; i++){            
            if(!temp.contains(arr[i])){
                temp.add(arr[i]);
            }           
        }
        
        for(int i=0; i<answer.length; i++){  
            answer[i] = temp.get(idx++);                  
            if(idx>= temp.size()){
                break;
            }
        }
        
        return answer;
    }
}