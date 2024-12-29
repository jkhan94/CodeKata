/*
전체 판 수 * 피자 조각 수 = 인원 * 같은 수의 피자 조각
answer * 6 = n의 배수
6, n의 최소공배수
*/
class Solution {
    static final int piece = 6; // 1판 조각 수
    
    public int solution(int n) {
        int totalPieces = (n*piece) / getGcd(n,piece);
        System.out.println(totalPieces);
        System.out.println(getGcd(n,piece));
        return totalPieces/piece;
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