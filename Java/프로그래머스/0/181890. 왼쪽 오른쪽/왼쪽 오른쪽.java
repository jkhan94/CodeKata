/*
테스트케이스 추가
["r"] []
["u","u","r","l"] ["l"]
["u", "u", "r"] []
["l", "u", "u", "r"] []
["l", "r", "l"] []
["r", "l", "l"] ["l", "l"]
["u", "u", "l"] ["u", "u"]
["u", "u"] []
["r", "u", "d", "d"] ["u", "d", "d"]
*/
import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int l = Arrays.asList(str_list).indexOf("l");
        int r = Arrays.asList(str_list).indexOf("r");

        // System.out.println(l+" "+r);
        
        if(r==-1 && l==-1){
            return answer;
        } else if(r==-1 || (l>=0 && l<r)){
            answer = Arrays.copyOf(str_list, l);
        } else if(l==-1 || (r>=0 && r<l)){
            answer = Arrays.copyOfRange(str_list, r+1, str_list.length);
        }        
        
        return answer;
    }
}