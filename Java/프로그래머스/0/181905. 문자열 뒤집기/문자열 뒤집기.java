class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer answer = new StringBuffer();
        
        answer.append(my_string.substring(0,s));
        for(int i=e; i>=s; i--){
            answer.append(my_string.charAt(i));
        }
        answer.append(my_string.substring(e+1,my_string.length()));
        
        return answer.toString();
    }
}