/*
특정 문자열이 몇 번 포함됐는지 알려주는 메소드는 없음.
*/
class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        
        for(int i=0; i<myString.length(); i++) {
            // 예외처리 불필요
            // 잘라서 문자열이 같은지 비교하는 것보다, 잘랐을 때 문자열로 시작하는지 보면 됨.
            if(myString.substring(i).startsWith(pat)){
                cnt++;
            }
        }
        
        return cnt;
    }
}
/*
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
*/