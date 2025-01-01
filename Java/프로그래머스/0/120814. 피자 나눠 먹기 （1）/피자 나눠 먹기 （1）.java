/*
7의 배수면 n/7
아니면 n/7+1
*/
class Solution {
    static final int PIECE = 7; // 피자 1판 조각 수
    
    public int solution(int n) {
        int answer = 0;    
        
        if(n%PIECE == 0){
            answer = n/PIECE;
        } else {
            answer = n/PIECE + 1;
        }
        
        return answer;
    }
}