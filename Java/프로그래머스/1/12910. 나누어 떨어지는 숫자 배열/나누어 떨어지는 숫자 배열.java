import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count=0;
        for(int items : arr){
            if(items%divisor==0){
                count++;
            }
        }
        if(count==0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[count];
        count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[count]=arr[i];
                count++;
            }
        }       
        // Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
        answer = Arrays.stream(answer).sorted().toArray();    
        
        return answer;
    }
}