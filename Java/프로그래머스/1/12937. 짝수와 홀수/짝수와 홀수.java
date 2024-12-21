// return (num % 2 == 0) ? "Even" : "Odd";
// 삼항연산자를 써도 됨.
class Solution {
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer = "Even";
        } else {
            answer="Odd";
        }
        
        return answer;
    }
}