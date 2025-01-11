/*
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
*/
class Solution {
    public int solution(int num, int k) {
        // num 앞에 문자를 추가해서 문자열로 변경 + 인덱스를 1부터 시작하게 함.    
        return ("-" + num).indexOf(String.valueOf(k));
    }
}