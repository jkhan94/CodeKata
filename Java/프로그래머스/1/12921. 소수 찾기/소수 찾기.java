/*
에라토스테네스의 체: n의 제곱근이하만큼 2부터 반복해서 나누어 떨어지지않으면 소수.

ㅓ<=Math.sqrt(i) 보다 j*j<=i가 단순 곱셈이라 더 빠름.
*/
class Solution {
    public int solution(int n) {
        int answer =  0;
        boolean isOdd = true;
        
        for(int i=2; i<=n; i++){
            for(int j=2; j*j<=i; j++){
                if(i%j == 0){
                    isOdd = false;
                    break;
                }          
            }
            if(isOdd){
                answer++;
            }
            isOdd = true;
        }
        
        return answer;
    }
}