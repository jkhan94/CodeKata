/*
배열의 길이
    짝수/2
    홀수/2+1
*/
class Solution {
    public int[] solution(int n) {        
        int temp = 1;
        
        int length = 0;
        if(n%2 == 0){
            length = n/2;
        } else {
            length = n/2 +1;
        }
        int[] answer = new int[length];
                
        answer[0] = 1;
        for(int i=1; i<answer.length; i++){
            answer[i] = answer[i-1]+2;            
        }       
        
        return answer;
    }
}