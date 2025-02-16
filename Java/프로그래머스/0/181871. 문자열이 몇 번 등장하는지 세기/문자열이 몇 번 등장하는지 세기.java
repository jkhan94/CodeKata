/*
특정 문자열이 몇 번 포함됐는지 알려주는 메소드는 없음.
*/
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = pat.length();
        
        for(int i=0; i<myString.length(); i++){
            if(i+len-1 >= myString.length()){
                break;
            }

            if(myString.substring(i,i+len).equals(pat)){
                answer++;
            }
        }
        
        return answer;
    }
}