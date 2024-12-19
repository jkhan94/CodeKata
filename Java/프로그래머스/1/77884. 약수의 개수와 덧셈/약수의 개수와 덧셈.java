// 13 + 14 + 15 + 17 - 16
// 24 + 26 + 27 - 25
// 31*31<1000
class Solution {
    public int solution(int left, int right) {
        int answer = 0;    
        
        for(int i=left; i<=right;i++){
            answer += i;
            for(int j=1; j<=31;j++){
                if(i/j==j && i%j==0) { 
                    answer -= 2*i;
                }
            }            
        }
        return answer;
    }
}
/*
// Math 함수 활용. 제곱근으로 나눠서 나머지가 0인지 확인.

for (int i=left;i<=right;i++) {    
    if (i % Math.sqrt(i) == 0) { //제곱수인 경우 약수의 개수가 홀수
        answer -= i;
    }
    else { //제곱수가 아닌 경우 약수의 개수가 짝수
        answer += i;
    }
}
*/