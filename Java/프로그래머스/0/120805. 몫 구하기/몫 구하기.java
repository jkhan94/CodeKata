class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        //입력값 체크
        if(check(num1) && check(num2)){
            // 몫 구하기
            answer=num1/num2;
        }        
        return answer;
    }
    
    private boolean check(int num){
        return num>=0 && num<=100;
    }
}