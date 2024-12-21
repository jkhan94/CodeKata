class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        // 숫자 범위 체크
        if (checkNum(num1) && checkNum(num2)){
            if(num1 == num2){
                answer=1;
                } else {
                    answer = -1;
                }   
        }       
        return answer;
    }
    
    public boolean checkNum(int num){
        return num >=0 && num <= 10000;
    }
}