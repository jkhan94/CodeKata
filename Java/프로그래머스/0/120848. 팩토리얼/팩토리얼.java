/*
n/a! = 0이면 a-1이 i
*/
class Solution {
    public int solution(int n) {
        int answer = 2;
        
        while(n/answer > 0){
            n/=answer;
            answer++;
        }
        
        return --answer;
    }
}