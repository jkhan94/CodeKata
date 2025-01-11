/*
테스트케이스 추가
"aabb" ""
"" ""
"aaaaaaabccccddeff" "be"
"baab" ""
*/
import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); // 문자, 개수
        
        if(s.equals("")){
            return "";
        }
        
        String[] ss = s.split("");
        Arrays.sort(ss);
        
       for(int i=0; i<ss.length; i++) {
           map.put(ss[i], map.getOrDefault(ss[i],0)+1);           
       }
        
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                answer += key;
            }
        }
        
        return answer;
    }
}