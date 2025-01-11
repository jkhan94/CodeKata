import java.util.*;
class Solution {
    public String solution(String my_string){        
        // String[] answer = my_string.toLowerCase().split("");                
        // Arrays.sort(answer);        
        // return String.join("", answer);
        
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}