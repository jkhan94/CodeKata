/*
A 65 0, Z 90 25
a 97 26, z 122 51
*/
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int len = my_string.length();
        int idx = 0;
        
        for(int i='A'; i<='Z'; i++){
            answer[idx++] = len - my_string.replace(String.valueOf((char)i),"").length();
        }
        for(int i='a'; i<='z'; i++){
            answer[idx++] = len - my_string.replace(String.valueOf((char)i),"").length();
        }
        
        return answer;
    }
}