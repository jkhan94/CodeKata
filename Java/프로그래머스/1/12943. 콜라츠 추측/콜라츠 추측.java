class Solution {
    public int solution(long num) {
        int answer = 0;
        if(num==1){
            return answer=0;
        }
        while(num!=1){  
            if(num%2==0){
                num/=2;
            } else {
                num=num*3+1;
            }
            answer++;
            if(answer>=500){
                answer=-1;
                break;
            }
        }       
        return answer;
    }
}

/*
// int로 계산하면 연산횟수 초과로 488이 뜸.
// 그래서 입력받은 int를 long으로 형변환한 후 계산해야 -1이 출력됨.

class Collatz {
    public int collatz(int num) {
        long n = (long)num;
        for(int i=0; i<500; i++){
            if(n==1) return i; 
            n = (n%2==0) ? n/2 : n*3+1;
        }
            return -1;
    }
*/