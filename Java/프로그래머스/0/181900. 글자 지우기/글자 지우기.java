import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer answer = new StringBuffer();
        String[] my = my_string.split("");
        int[] idx= new int[my_string.length() - indices.length];
        
        for(int i : indices){
            my[i]="";
        }
        for(String m:my){
            if(m.isEmpty()){
                continue;
            }
            answer.append(m);
        }            
        
        return answer.toString();
    }
}