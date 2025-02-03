/*
맵에 각 연산 종류를 저장해서 처리할 수도 있음
그러나  각 연산의 횟수를 세서 최종값만 리턴하는 게 나을 듯.
*/
import java.util.*;
class Solution {
    public int solution(int n, String control) {  
        int[] cnt = new int[4]; // wsda 연산 횟수
    
        for(int i=0; i<control.length(); i++){
            switch(control.charAt(i)){
                case 'w':
                   cnt[0]++;
                   break;
                case's':
                   cnt[1]++;
                   break;
                case'd':
                   cnt[2]++;
                   break;
                case'a':
                  cnt[3]++;
                  break;
            }
        }
        
        return n + cnt[0] -cnt[1] + (cnt[2]- cnt[3])*10;
    }
}