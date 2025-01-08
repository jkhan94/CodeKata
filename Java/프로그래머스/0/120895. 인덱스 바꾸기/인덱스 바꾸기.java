import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] my = my_string.toCharArray();
        
        char temp = my[num2];
        my[num2] = my[num1];
        my[num1]=temp;
        
        // return String.valueOf(my); 
        return new String(my);
    }
}