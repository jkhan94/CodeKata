class Solution {
    public int solution(int age) {
        int answer = 0;
        
        // 사람 나이인지 확인
        if (checkAge(age)){
            // 2022년에 5살이면 2018년생
            // 태어난 해 = 기준연도 - 나이 +1
            answer=2022-age+1;
        }
        return answer;
    }
    
    private boolean checkAge(int age){
        return age>0 && age<=120;
    }
}