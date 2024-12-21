class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double quotient=0.0;
        if(check(num1) && check(num2)){
            quotient = (num1*1000)/num2;            
            answer = (int)(quotient);
        }        
        return answer;
    }
    
    public boolean check(int num){
        return 0<num && num<=100;
    }
}