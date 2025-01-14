/*
참고: https://school.programmers.co.kr/learn/courses/30/lessons/120886

Arrays.toString(temp) : [d, e, f]
String.join("", temp) : dos
*/
/*
import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i=0; i<dic.length; i++){            
            String[] temp = dic[i].split("");
            Arrays.sort(temp);
            Arrays.sort(spell);
            
            String t = String.join("",temp);
            String s = String.join("",spell);
            
            if(t.equals(s)){
                answer=1;
            }                        
        }
        
        return answer;
    }
}
*/
class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i=0;i<dic.length;i++){
            int answer = 0;
            
            // 단어별로 spell 포함하면 +1
            for(int j=0;j<spell.length;j++){
                if(dic[i].contains(spell[j])) answer ++;
            }
            
            // spell의 길이와 answer가 동일하다면 spell 모두 포함
            if(answer==spell.length){ 
                return 1;
            }
        }
        
        return 2;
    }
}