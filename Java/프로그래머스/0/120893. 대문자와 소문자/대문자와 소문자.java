/*
대문자는 65부터 소문자는 97부터 시작
*/
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] my = my_string.split("");
        
        for(int i=0; i<my.length; i++){
            if(Character.isUpperCase(my[i].charAt(0))){
                answer+=my[i].toLowerCase();
            } else{
                answer+=my[i].toUpperCase();
            }
        }
        
        return answer;
    }
}