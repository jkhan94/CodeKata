/*
4/2=2 인덱스1 리턴
5/2=2 인덱스2 리턴
*/
class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length()%2!=0){
            answer= new StringBuilder().append(s.charAt(s.length()/2)).toString();     
        } else {
            // answer= new StringBuilder().append(s.charAt((s.length()/2)-1)).append(s.charAt(s.length()/2)).toString();
            answer = s.substring((s.length()/2)-1, (s.length()/2)+1);
        }
        
        return answer;
        // return word.substring((word.length()-1)/2, word.length()/2 + 1);
    }
}