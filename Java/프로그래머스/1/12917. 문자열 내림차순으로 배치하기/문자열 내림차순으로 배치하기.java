import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = s;
        if(s.length()!=1){
            char[] ch = s.toCharArray();
            char temp;
            Arrays.sort(ch);
            for(int i=0; i<ch.length/2; i++){
                temp = ch[i];
                ch[i]=ch[ch.length-1-i];
                ch[ch.length-1-i]=temp;
            }               
            answer = new String(ch);
        } 
        return answer;
    }
}
/*
// https://wave-m.tistory.com/32*
import java.util.*;
class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer);
        Collections.reverse(Arrays.asList(answer));       
        return String.join("", answer);
    }
}
*/
/*
import java.util.Arrays;
public class ReverseStr {
    public String reverseStr(String str){
        char[] sol = str.toCharArray();
       Arrays.sort(sol);
       return new StringBuilder(new String(sol)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}
*/