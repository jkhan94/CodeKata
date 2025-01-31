/*
전체 판 수 * 피자 조각 수 = 인원 * 같은 수의 피자 조각
answer * 6 = n의 배수
6, n의 최소공배수
*/
class Solution {
    static final int PIECE = 6; // 1판 조각 수
    
    public int solution(int n) {
        int totalPieces = (n*PIECE) / getGcd(n,PIECE);
        return totalPieces/PIECE;
    }
    
    private int getGcd(int n, int piece){
        int temp = 0;
        int answer = piece;
        int remainder = n%piece;
        
        while(remainder > 0){
            if(remainder != 0){
               temp = answer;
               answer = remainder;
               remainder = temp%remainder;
            }
        }
        
        return answer;
    }
}
/*
// answer * 6 = n의 배수이므로 n으로 나누어떨어질 때까지 판 수를 더하면 됨
class Solution {
    public int solution(int n) {
        int answer = 1;

        while(true){
            if(6*answer%n==0) break;
            answer++;
        }

        return answer;
    }
}
*/