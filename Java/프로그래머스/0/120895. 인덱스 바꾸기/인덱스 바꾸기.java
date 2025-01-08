import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] my = my_string.toCharArray();
        
        // char temp = my[num2];
        // my[num2] = my[num1];
        // my[num1]=temp;        
        my[num1] = my_string.charAt(num2);
        my[num2] = my_string.charAt(num1);
        
        // return String.valueOf(my); 
        return new String(my);
    }
}