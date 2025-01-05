/*
순서 무관. nCr = n!/(n-r)!*r! = nCn-r
오버플로우 나서 에러 나는 듯. 곰하면서 동시에 나눠야 BigInteger 안 쓸 수 있음.

추가 테스트케이스: (27 11 13037895) (30 3 4060) (13 6 1716)
*//*
import java.math.*;
class Solution {
    public int solution(int balls, int share) {    
        long answer = 1;
        for(int i=0; i <share; i++){
            answer*=balls-i;
            answer/=i+1;
        }
      
        return (int)answer;
    }    
}
*/

class Solution {
    public long solution(int balls, int share) {
        share = Math.min(balls - share, share); // 계산 횟수 최소화

        if (share == 0) { // 0개 고르면 nC0 = 1
            return 1;
        }

        long result = solution(balls - 1, share - 1); // 재귀함수
        result *= balls;
        result /= share;

        return result;
    }
}
