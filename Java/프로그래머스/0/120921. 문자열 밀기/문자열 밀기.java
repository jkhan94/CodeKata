/*
테스트케이스 추가
"abc" "bca" 2
*/
import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        boolean isPossible = false;
        
        for(int i=0; i<A.length(); i++){
            if(A.equals(B)) {
                isPossible = true;
                break;
            }
            A = A.charAt(A.length()-1)+A.substring(0,A.length()-1);
            answer++;                      
        }        
        
        if(!isPossible){
            answer = -1;
        }
        
        return answer;
    }
}