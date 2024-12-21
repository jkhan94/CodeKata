class Solution {
    public int[] solution(int[] arr) {              
        if(arr.length <= 1){
            int[] answer = {-1}; 
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(min != arr[i]){
                answer[index] = arr[i];
                index++;
            }            
        }
        
        return answer;
       
    }
}
/*
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

// 스트림은 속도가 느린 것 같다.
class Solution {
  public int[] solution(int[] arr) {
      if (arr.length <= 1){ 
         return new int[]{ -1 }; 
      }
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray();
  }
}
*/