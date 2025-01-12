/*
s에 영단어가 있는지 검사
있으면 교체
*/
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i=0; i<words.length;i++){
            if(s.contains(words[i])){
                s=s.replace(words[i], Integer.toString(i));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }
        
        return Integer.parseInt(s);
    }
}
*/