import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        /*
        123/100 = 1 나머지 23
        123/10 = 12 나머지 3
        이거 아닌 거 같고.
        
        123/10 = 12 나머지 3
        12/10 = 1 나머지 2
        1/10 = 0 나머지 1 */
        /*        
        if(0<=n && n<=100000000){
            if(n==0){
                answer=0;
            } else {
                while(n>0){
                    answer += n%10;
                    n/=10;
                }
            }            
        }*/
        
        // 문자열로 변환해서 파싱해도 될 듯.
        String number = Integer.toString(n);
        for(int i=0; i<number.length(); i++){
            answer += Integer.parseInt(number.substring(i,i+1));
        }

        return answer;
    }
}