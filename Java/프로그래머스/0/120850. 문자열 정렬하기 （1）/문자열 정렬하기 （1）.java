import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String myNum = my_string.replaceAll("[^0-9]",""); // 숫자만 남김
        String[] my = myNum.split("");
        int[] answer = new int[my.length];
        
        for(int i=0; i<my.length; i++){
            answer[i]=Integer.parseInt(my[i]);
        }        
        Arrays.sort(answer);                
        
        return answer;
    }
}