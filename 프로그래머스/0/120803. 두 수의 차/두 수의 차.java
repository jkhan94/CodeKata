class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        // 입력값 범위 체크
        if(check(num1) && check(num2)){
            // 연산
            answer = num1 - num2;
        }          
        return answer;
    }
    
    private boolean check(int num){
        return num >=-50000 && num<=50000;
    }
}