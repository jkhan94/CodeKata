class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
/*
class Solution {
    public String solution(String my_string, int k) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<k; i++){
            answer.append(my_string);
        }
        
        return answer.toString();
    }
}
*/