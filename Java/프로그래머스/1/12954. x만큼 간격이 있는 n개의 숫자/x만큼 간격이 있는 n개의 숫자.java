// val은 long이여야 한다. int로 받을 경우 배열에 저장할 때 에러 발생.
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        long val=0;
        
        if(check(x) && 0<=n && n<=1000){
            answer = new long[n];
            val = x;
            for(int i=0; i<n; i++){             
                answer[i]=val;
                val += x;
            }
        }
        
        return answer;
    }
    
    public boolean check (int x){
        return -10000000 <= x && x <= 10000000;
    }
}

/*
// 배열 선언할 때 n 활용.
// 첫 값을 저장하고, 그 이후 값은 반복문을 활용해 저장.
import java.util.*;
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

return answer;
    }
}

*/
