/*
유클리드 호제법
a%b=r1
b%r1=r2
r1%r2=0 이면 r2가 GCD

LCM은 LCM = a'*b'*r2
a*b = a'*r2*b'*r2
LCM = a*b/r2
*/
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {           
// 1. 공통 분모 만들기. 최대공배수.
        int gcd = getGcd(denom1, denom2);
        int lcm = getLcm(denom1, denom2, gcd);
        int denom = lcm;
        
// 2. 분자 더하기
        int numer = numer1*lcm/denom1 + numer2*lcm/denom2;
// 3. 분자, 분모 약분되는지 확인하기 최대공약수
        gcd = getGcd(numer, denom);
        if(gcd!=1){
            numer/=gcd;
            denom/=gcd;
        }
        
        int[] answer = {numer, denom};
        return answer;
    }
    
    private int getGcd(int numer, int denom){
        int r = numer%denom;
        if(r == 0){
            return denom;
        }
        int temp = 0;
        while(r>0){
            temp = r;
            r = denom%r;
            denom = temp;            
        }
        return temp;
    }
    
    private int getLcm(int numer, int denom, int gcd){
        return numer*denom/gcd;
    }
}