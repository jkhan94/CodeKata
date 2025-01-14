/*
유사 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120902
*/
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] eq = quiz[i].split(" ");
            int a = Integer.parseInt(eq[0]);
            int b = Integer.parseInt(eq[2]);
            int c = Integer.parseInt(eq[4]);
            
            if(eq[1].equals("+")){
                if(a+b == c){
                    answer[i]="O";
                } else {
                    answer[i]="X";
                }
            } else if(eq[1].equals("-")){
                if(a-b == c){
                    answer[i]="O";
                } else {
                    answer[i]="X";
                }
            }
            
        }
        return answer;
    }
}