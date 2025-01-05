// 순서 무관. nCr = n!/(n-r)!*r!
// 오버플로우 나서 에러 나는 듯
// (27,11) (30,3)
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