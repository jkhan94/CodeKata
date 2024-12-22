/*
// 금액*(등차수열의 합) - 잔액과 0 중 큰 값 리턴
return Math.max(price * (count * (count + 1) / 2) - money, 0);
*/
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i=1; i<=count; i++){
            answer += i;
        }
        answer *= price;
        answer = money - answer;
        if(answer >=0){
            return 0;
        } 

        return answer*-1;
    }
}