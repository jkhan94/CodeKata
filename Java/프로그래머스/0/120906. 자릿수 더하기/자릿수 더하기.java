/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] s = String.valueOf(n).split("");
        
        for(int i=0; i<s.length; i++){
            answer+= Integer.parseInt(s[i]);
        }
        
        return answer;
    }
}
*/
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            answer += n%10;
            n/=10;
        }
        
        return answer;
    }
}