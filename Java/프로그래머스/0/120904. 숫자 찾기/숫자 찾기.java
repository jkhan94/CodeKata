class Solution {
    public int solution(int num, int k) {
        String s = String.valueOf(num);
        int answer = 0;
        
        if(s.contains(String.valueOf(k))){
            answer = s.indexOf(String.valueOf(k))+1;
        } else {
            answer = -1;
        }
        
        return answer;
    }
}